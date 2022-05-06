package DAY1;

import java.util.Arrays;

/**
 * SetMatrixZero
 */
public class SetMatrixZero {

    public static void setZeroes(int[][] matrix) {


        //here we can't handel "-" input

    /*     int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {

                    int index = i-1;
                    while (index >= 0) {
                        if (matrix[index][j] != 0) {
                            matrix[index][j] = -1;
                        }
                        index--;
                    }
                    index = i+1;
                    while (index < row) {
                        if (matrix[index][j] != 0) {
                            matrix[index][j] = -1;
                        }
                        index++;
                    }
                    index = j - 1;
                    while (index >= 0) {
                        if (matrix[i][index] != 0) {
                            matrix[i][index] = -1;
                        }
                        index--;
                    }
                    index = j + 1;
                    while (index < col) {
                        if (matrix[i][index] != 0) {
                            matrix[i][index] = -1;
                        }
                        index++;
                }
            }
            
        }
    }
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if(matrix[i][j] <= 0){
                matrix[i][j] = 0;
            }
        }
    } */


    int rows = matrix.length, cols = matrix[0].length;
  int dummy1[]=new int[rows];
  int dummy2[]=new int[cols];
  Arrays.fill(dummy1,-1);
  Arrays.fill(dummy2,-1);
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      if (matrix[i][j] == 0) {
        dummy1[i] = 0;
        dummy2[j] = 0;
      }
    }

  }
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      if (dummy1[i] == 0 || dummy2[j]==0) {
        matrix[i][j] = 0;
      }
    }
  }

        

        
    }

    public static void main(String[] args) {
        int arr[][] = {{1,1,1} , {1, 0, 1}, {1, 1, -10000}};
        setZeroes(arr);

        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
    }
}