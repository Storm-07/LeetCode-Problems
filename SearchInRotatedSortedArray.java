class SearchInRotatedSortedArray {
    public boolean search(int[] nums, int target) {
        boolean inarr = false;
        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] == target) 
                inarr = true;
        }

        return inarr;
    }
}
