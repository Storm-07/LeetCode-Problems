class PalindromeInteger {
    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int num = x;
        int ans = 0;
        while(x != 0) {
            ans = (ans * 10) + (x % 10);
            x /= 10;
        }

        return (num == ans);
    }

    public static void main(String[] args) {
        int testnum = 121;
        boolean isPalindromeInt = isPalindrome(testnum);
        System.out.println(isPalindromeInt);
    }
}
