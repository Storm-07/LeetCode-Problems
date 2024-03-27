public class SimilarRectangles {
    public static long interchangeableRectangles(int[][] rectangles) {
        long count = 0;

        for(int i = 0; i <= rectangles.length - 1; i++) {
            for(int j = i + 1; j <= rectangles.length - 1; j++) {
                double ratio1 = (double) rectangles[i][0] / rectangles[i][1];
                double ratio2 = (double) rectangles[j][0] / rectangles[j][1];

                if(ratio1 == ratio2) 
                    count++;
            }   
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] rects = {{4,8},{3,6},{10,20},{15,30}};
        int[][] rects2 = {{4,5},{7,8}};

        System.out.println(interchangeableRectangles(rects));
    }
}
