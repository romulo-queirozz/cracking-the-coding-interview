package datastructure.array_and_strings;

public class RotateMatrix {

//    Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
//    bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);
        System.out.println("output");
        printMatrix(answer(matrix));

    }

    public static int[][] answer(int[][] matrix) {
        int N = matrix.length;
        int[][] rotated = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[j][N - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
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
