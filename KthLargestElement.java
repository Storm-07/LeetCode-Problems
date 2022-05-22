// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.

import java.util.Arrays;

public class KthLargestElement {
    public static int KthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int length = nums.length;
        return nums[length - k];
    }

    public static void main(String[] args) {
        int[] nuggets = {4, 2, 3, 6};
        int k = 2;
        System.out.println(k + " largest element is: " + KthLargest(nuggets, k));
    }
}
