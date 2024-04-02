public class HarshadNumber {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = sumDigits(x); // get sum of digits
        int divnumber = 0;
        if(x % sum == 0) { // set divnumber accordingly
            divnumber = sum;
        }
        else {
            divnumber = -1;
        }
        return divnumber;
    }

    public static int sumDigits(int number) {
        // Convert the integer to a string
        String numString = String.valueOf(number);
        int sum = 0;

        // Iterate over each character of the string
        for (int i = 0; i < numString.length(); i++) {
            // Convert each character back to integer and add to sum
            sum += Character.getNumericValue(numString.charAt(i));
        }

        return sum;
    }

    public static void main(String[] args) {
        int testnum = 23;
        System.out.println(sumOfTheDigitsOfHarshadNumber(testnum));
    }
}
