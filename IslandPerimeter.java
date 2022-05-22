// You are given row x col grid representing a map where grid[i][j] = 1 
// represents land and grid[i][j] = 0 represents water.
// Grid cells are connected horizontally/vertically (not diagonally). 
// The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
// The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. 
// One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
// Determine the perimeter of the island.

public class IslandPerimeter {
    public static int findPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j]==1) {
                    perimeter +=4;
            
                if(i>0)
                    if(grid[i-1][j]==1)
                        perimeter--;
                if(j>0)
                    if(grid[i][j-1]==1)
                        perimeter--;
                if(j<cols-1)
                    if(grid[i][j+1]==1)
                        perimeter--;
                if(i<rows-1)
                    if(grid[i+1][j]==1)
                        perimeter--;
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        int[][] island = new int[4][4];
        island[0][1] = 1;
        island[2][3] = 1;
        System.out.println("Perimeter of island is: " + findPerimeter(island));
    }
}
