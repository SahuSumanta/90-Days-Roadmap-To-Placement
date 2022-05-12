package DAY2;

// import java.util.Arrays;

/**
 * RotateImage
 */
public class RotateImage {

    // Brute Force     TC & SC= O(n^2)
    /*public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] dummy = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dummy[j][n-i-1] = matrix[i][j];
            }
        }
        return dummy;
    }*/

    // Optimal Approach TC = O(n^2) SC = O(1)
    public static void rotate(int[][] matrix){
        //transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length/2 ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}