import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14,15},
                {16, 17, 18, 19, 20},
        };
        spiral(matrix);
    }

    /**
     * Accepts a 2D array of integers and returns a 1D array with the contents of the original 2D
     * array in the order they would appear if visited in a spiral order, clockwise starting from
     * top-left.
     * @param matrix        2D array
     * @return              1D spiral array
     */
    public static int[] spiral(int[][] matrix) {
        // Form 1D matrix size
        int row = matrix.length;
        int col = matrix[0].length;
        int[] spiral = new int[row*col];

        // Initialize matix boundary values
        int s_ind = 0; // spiral list index
        int top = 0; // top bound
        int bot = row - 1; // bottom bound
        int left = 0; //left bound
        int right = col - 1; // right bound
        int dir = 0; // direction

        // Input matrix value related to direction, boundary, and position into 1D array
        while (top<=bot && left <= right){
            // left to right traversal starting at left boundary
            if (dir == 0){
                for (int i = left; i<=right;i++){
                    System.out.println(matrix[top][i]);
                    spiral[s_ind] = matrix[top][i];
                    s_ind++;
                }
                top++;
            }
            // top to bottom traversal starting at top boundary
            else if (dir == 1){
                for (int i = top; i<=bot;i++){
                    System.out.println(matrix[i][right]);
                    spiral[s_ind] = matrix[i][right];
                    s_ind++;
                }
                right--;
            }
            // right to left traversal starting at right boundary
            else if (dir == 2){
                for (int i = right; i>=left;i--){
                    System.out.println(matrix[bot][i]);
                    spiral[s_ind] = matrix[bot][i];
                    s_ind++;
                }
                bot--;
            }
            // bottom to top traversal starting at bottom boundary
            else if(dir == 3){
                for (int i = bot; i>=top;i--){
                    System.out.println(matrix[i][left]);
                    spiral[s_ind] = matrix[i][left];
                    s_ind++;
                }
                left++;
            }
            // update direction in sequential order of 0,1,2,3
            dir = (dir+1)%4;
        }
        return spiral;
    }
}