package DAY4;

import java.util.Arrays;

public class LongestConsecutive {


    //Brute Force  TC = O(Nlog(N)) Sc =O(1)
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        
        int ans = 1;
        int prev = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == prev+1) {
                count++;
            }
            else if (nums[i] != prev) {
                count = 1;
            }
            prev = nums[i];
            ans = Math.max(ans, count);
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}
