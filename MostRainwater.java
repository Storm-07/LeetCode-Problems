class MostRainwater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {
            int width = right - left;
            int heightB = Math.min(height[left], height[right]);
            int area = width * heightB;
            max = Math.max(max, area);

            if(height[left] > height[right])
                right--;
            else if(height[left] < height[right])
                left++;
            else {
                left++;
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] testcontainer = {1,8,6,2,5,4,8,3,7};

        // max area is 49 since {8,7} rounds to 7 and width is 7 so 7(h) * 7(w) = 49.
        System.out.println(maxArea(testcontainer));
    }
}
