package DAY1;

/**
 * KadensAlgo
 */
public class KadensAlgo {

    public static int maxSubArray(int[] arr) {

        int max_sum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum > max_sum) {
                max_sum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
        
    }


    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}