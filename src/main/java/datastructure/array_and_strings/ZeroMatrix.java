package datastructure.array_and_strings;

public class ZeroMatrix {

//    Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
//    column are set to 0.
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 3},
                {4, 0, 6, 3},
                {7, 8, 9, 3}
        };

        printMatrix(matrix);
        System.out.println("output");
        printMatrix(answer(matrix));
    }

    public static int[][] answer(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] column = new boolean[columns];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
