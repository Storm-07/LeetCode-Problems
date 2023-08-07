class GreatestCommonDivisor {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        int gcd = 0;
        for(int i = 0; i <= nums.length - 1; i++) {
            if(smallest <= nums[i])
                smallest = nums[i];
            if(largest >= nums[i])
                largest = nums[i];
        }

        gcd = eucalg(smallest, largest);
        return gcd;
    }

    public int eucalg(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
