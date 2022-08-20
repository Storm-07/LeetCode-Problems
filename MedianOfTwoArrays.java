import java.util.Arrays;

public class MedianOfTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[m + n];
        double median = 0.0;
        int o = merged.length;
        
        System.arraycopy(nums1, 0, merged, 0, n);
        System.arraycopy(nums2, 0, merged, n, m);
        
        Arrays.sort(merged);
        double[] Dmerged = Arrays.stream(merged).asDoubleStream().toArray();
        for(double a: Dmerged) {
            System.out.print(a + ", ");
        }
        System.out.println(); // print merged array

        if(o % 2 == 1) { // if size is odd
            median = Dmerged[(o + 1) / 2 - 1];
        }
        else { // if size is even
            median = ((Dmerged[(o / 2) - 1]) + (Dmerged[o / 2])) / 2;
        }
        
        return median;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
