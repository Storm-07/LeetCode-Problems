import java.util.HashSet;
import java.util.Set;

public class ThirdMaxNumber {
    public static int thirdMax(int[] nums) {
        // Initialize three largest variables and their set flags
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean firstSet = false;
        boolean secondSet = false;
        boolean thirdSet = false;

        Set<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            if (seen.contains(num)) continue; // Skip duplicates
            seen.add(num);

            if (!firstSet || num > first) { 
                third = second;
                thirdSet = secondSet;
                second = first;
                secondSet = firstSet;
                first = num;
                firstSet = true;
            } else if (!secondSet || num > second) {
                third = second;
                thirdSet = secondSet;
                second = num;
                secondSet = true;
            } else if (!thirdSet || num > third) {
                third = num;
                thirdSet = true;
            }
        }

        // If third is still not set, it means there are less than three distinct numbers
        if (!thirdSet) {
            return first;
        }
        return third;
    }

    public static void main(String[] args) {
        int[] testnums = {};
        System.out.println(thirdMax(testnums));
    }
}
