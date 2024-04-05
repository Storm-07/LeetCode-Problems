public class MaxAlphanumericValue {
    public static int getMaxValue(String[] strs) {
        /*
         * This line initializes a variable maxValue with the smallest possible integer value. 
         * This is commonly used as an initial value when you want to find the maximum value among a set of integers, 
         * especially when you're not sure if the actual values will be greater or lesser than this minimum value.
         */
        int maxValue = Integer.MIN_VALUE;
        
        for (String str : strs) {
            int value = getValue(str); // helper method
            maxValue = Math.max(maxValue, value);
        }
        
        return maxValue;
    }
    
    public static int getValue(String str) {
        // Check if the string comprises of digits only
        boolean isNumeric = str.matches("\\d+");
        
        if (isNumeric) {
            // If it's numeric, return its integer value
            return Integer.parseInt(str);
        } else {
            // Otherwise, return the length of the string
            return str.length();
        }
    }
    
    public static void main(String[] args) {
        String[] strs = {"1","01","001","0001"};
        int maxValue = getMaxValue(strs);
        System.out.println("Maximum value: " + maxValue);
    }
}
