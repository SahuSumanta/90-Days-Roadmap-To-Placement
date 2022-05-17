package DAY3;

import java.util.ArrayList;

/**
 * ReversePair
 */
public class ReversePair {

    /* public static int reversePairs(int[] nums) {

        //brute Force TC = O(n^2) SC = O(1)
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > 2*nums[j]) pairs++;
            }
        }
        return pairs;
        
    } */

    // Optimal Solution TC = O( N log N ) + O (N) + O (N)   SC = O(N)
    public static int reversePairs(int[] nums){
        return mergeSort(nums, 0, nums.length-1);
    }

    private static int mergeSort(int[] nums, int low, int high) {

        if(low >= high) return 0;
        int mid = (low+high) / 2;
        int left = mergeSort(nums, low, mid);
        left += mergeSort(nums, mid+1, high);
        left += merge(nums, low, mid, high);

        return left;
    }

    private static int merge(int[] nums, int low, int mid, int high) {

        int count = 0;
        int  j = mid+1;

        for(int i = low; i <= mid; i++){
            while (j <= high && nums[i] > (2*nums[j])) {
                j++;
            }

            count += (j - (mid+1));
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int left = low, right = mid+1;

        while(left <= mid && right <= high){
            if(nums[left] <=  nums[right]) {
                arr.add(nums[left++]);
            }else{
                arr.add(nums[right++]);
            }
        }

        while (left <= mid){
            arr.add(nums[left++]);
        }

        while(right <= high){
            arr.add(nums[right++]);
        }

        for(int  i = low; i <= high; i++){
            nums[i] = arr.get(i-low);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        System.out.println(reversePairs(arr));
        
    }
}