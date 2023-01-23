class ReverseInteger {
    public static int reverse(int x) {
        long ans = 0;
        while(x != 0) {
            ans = ans * 10 + (x % 10);
            x /= 10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) ans;
        }
    }

    public static void main(String[] args) {
        int testnum = 1234;
        int reversed = reverse(testnum);
        System.out.println(reversed);
    }
}
