public class Spiral {

    // variable
    private int[] spiral;
    public Spiral(int[][] matrix) {
        // Count number of values in 2D array, get shape and determine number

        // Mark boundary of traverser array
        //
        int row = matrix.length;
        int col = matrix[0].length;
        this.spiral = new int[row * col];
        int s_ind = 0;
        int top = 0;
        int bot = row - 1;
        int left = 0;
        int right = col - 1;
        int dir = 0;

        while (top <= bot && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.println(matrix[top][i]);
                    this.spiral[s_ind] = matrix[top][i];
                    s_ind++;
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bot; i++) {
                    System.out.println(matrix[i][right]);
                    this.spiral[s_ind] = matrix[i][right];
                    s_ind++;
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    System.out.println(matrix[bot][i]);
                    this.spiral[s_ind] = matrix[bot][i];
                    s_ind++;
                }
                bot--;
            } else if (dir == 3) {
                for (int i = bot; i >= top; i--) {
                    System.out.println(matrix[i][left]);
                    this.spiral[s_ind] = matrix[i][left];
                    s_ind++;
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
    }
}
