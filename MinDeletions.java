public class MinDeletions {
    public static int minimumDeletions(int[] A) {
        int i = 0, j = 0, n = A.length;
        for (int k = 0; k < n; ++k) {
            if (A[i] < A[k]) i = k; // maxidx
            if (A[j] > A[k]) j = k; // minidx
        }

        return Math.min(Math.min(Math.max(i + 1, j + 1), Math.max(n - i, n - j)), Math.min(i + 1 + n - j, j + 1 + n - i));
        // Math.min(Math.max(i + 1, j + 1), Math.max(n - i, n - j)) -> compares halves basically from each end comparing DISTANCE not the indexes
        // Math.min(i + 1 + n - j, j + 1 + n - i)                   -> this is comparing if the distance would be smaller comparing from both ends and not one end at a time
        // to simplify, first comment checks if it'd be faster for if min and max are closer to one end, second checks if it'd be faster checking from both closest ends.
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 10, 3, 8, 15}; // 3
        int[] nums2 = {2, 2, 2, 2, 4, 4, 2, 1}; // 4
        int[] nums3 = {2, 4, 2, 2, 1, 2, 2, 2}; // 5
        int min1 = minimumDeletions(nums1);
        int min2 = minimumDeletions(nums2);
        int min3 = minimumDeletions(nums3);
        System.out.println(min1);
        System.out.println(min2);
        System.out.println(min3);
    }
}
