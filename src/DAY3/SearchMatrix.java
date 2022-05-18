package DAY3;

/**
 * InnerSearchMatrix
 */
public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        //Brute Force  TC = O(m*n) SC = O(1)
        /*for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;*/

        //Binary Search TC = O(log(m*n)) SC = O(1)
        if(matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = (m*n) - 1;

        while(low <= high){
            int mid = (low+(high - low)/2);
            if(matrix[mid/n][mid%n] == target) return true;

            if (matrix[mid/n][mid%n] < target) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7}, {10,11,16,20}, {23, 30, 34, 60} };
        System.out.println(searchMatrix(arr, 3));

    }
}