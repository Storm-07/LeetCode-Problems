public class powerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n <= 0) return false; // checks invalid cases (0, -1...)

        double logResult = Math.log10(n) / Math.log10(3); // log 3
        
        return (logResult - Math.floor(logResult)) < 1e-10; // if rounded int is log 3 then true
    }

    public static void main(String[] args) {
        int testnum = 27;
        System.out.println(isPowerOfThree(testnum));
    }
}
