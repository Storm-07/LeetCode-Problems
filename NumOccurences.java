import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NumOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num: arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1); // num, instanceOfNumCount (thats what +1 is for)
        }

        HashSet<Integer> countSet = new HashSet<>(countMap.values());
        return countMap.size() == countSet.size();
        /*
         *  Consider an array [1, 2, 2, 3, 3, 3]. After counting the occurrences, the HashMap would look like {1: 1, 2: 2, 3: 3}. Now, the counts are 1, 2, and 3.
         *  If we add these counts (1, 2, and 3) into a HashSet, we would have {1, 2, 3}.
         *  The size of the HashSet is 3.
         *  Since there are 3 distinct counts in the HashMap, and the size of the HashSet is also 3, each count is unique, and we return true.
         */
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};

        System.out.println("Is count of occurrences unique in arr1? " + uniqueOccurrences(arr1)); // Output: true
        System.out.println("Is count of occurrences unique in arr2? " + uniqueOccurrences(arr2)); // Output: false
    }
}
