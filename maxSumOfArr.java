public class maxSumOfArr {
    public static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int maxNum = 0;
        for(int num: nums) {
            maxNum = Math.max(maxNum, num);
        }

        while(k > 0) {
            sum += maxNum;
            maxNum++;
            k--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] testNums = {5,5,5};
        int k = 2;
        System.out.println(maximizeSum(testNums, k));
    }
}
