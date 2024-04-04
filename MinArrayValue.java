public class MinArrayValue {
    public static int minimizeArrayValue(int[] nums) {
        long sum = 0, ans = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, (sum + i) / (i + 1));
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int[] nums = {10,2,6,15};
        System.out.println(minimizeArrayValue(nums));
    }
}
