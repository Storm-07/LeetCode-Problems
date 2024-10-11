import java.util.Arrays;
import java.util.HashSet;

public class twoDigitville {
    public static int[] getSneakyNumber(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int[] sneakyNums = new int[2];
        int index = 0;

        for(int num : nums) {
            if(seen.contains(num)) sneakyNums[index++] = num;
            else seen.add(num);

            if(index == 2) break;
        }
        return sneakyNums;
    }

    public static void main(String[] args) {
        int[] testVals = {0,3,2,1,3,2};
        System.out.println(Arrays.toString(getSneakyNumber(testVals)));
    }
}
