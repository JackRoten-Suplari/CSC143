import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {

    }

    @Test
    void spiral() {
        int[][] matrixOne = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14,15},
            {16, 17, 18, 19, 20},
        };

        int[] spiralOne = {1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12};

//        int[] spiralOneResult = new Spiral(matrixOne);
//        assertEquals()




        int[][] matrixTwo = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
        };
        int[] spiralTwo = {1, 2, 3, 4, 5, 6, 12, 18, 24, 30, 29, 28, 27, 26, 25, 19, 13,
                7, 8, 9, 10, 11, 17, 23, 22, 21, 20, 14, 15, 16};


    }
}