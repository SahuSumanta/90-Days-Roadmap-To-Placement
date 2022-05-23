package DAY4;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(nums[i]+nums[j] == target){
                    ans[0] = j;
                    ans[1] = i;
                }
            }
            
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
