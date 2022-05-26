package DAY4;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr, arr.length));
    }
    //brute force TC = O(n^2) SC = O(1)
    /* static int maxLen(int arr[], int n)
    {
        int max = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == 0){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        
        return max;
    } */

    //Optimal Approach
    public static int maxLen(int arr[], int n){
        HashMap<Integer, Integer> h = new HashMap<>();
            int sum = 0;
            int max = 0;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if (sum == 0) {
                max = i+1;
            }
            else{
                if(h.get(sum) != null){
                    max = Math.max(max, i - h.get(sum));
                }else{
                    h.put(sum, i);
                }
            }
        }
        return max;
    }

}
