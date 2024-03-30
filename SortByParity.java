public class SortByParity {
    public static int[] sortByParity(int[] nums) {
        int i = 0; // beginning pointer
        int j = nums.length-1; // ending pointer
        while(i < j) {
            if(nums[i] % 2 != 0 && nums[j] % 2 == 0) { // check i for odd, j for even, swap.
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            else if(nums[j] % 2 != 0) { // case for j odd
                j--;
            }
            else { // case for i even
                i++;
            }
        }
        return nums; 
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4,5,7,6};
        int[] s = sortByParity(nums);
        for(int num: s) 
            System.out.print(num + " ");
    }
}
