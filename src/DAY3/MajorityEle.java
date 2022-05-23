package DAY3;

// import java.util.Arrays;
// Time Complexity: O(N) 
// Space Complexity: O(1)



public class MajorityEle {
    public static void main(String[] args) {

        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    /*public static int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }*/

    // Moore’s Voting Algorithm
    public static int majorityElement(int[] nums){
        int count = 0;
        int Element = 0;

        for (int i : nums) {
            if (count == 0) {
                Element = i;
            }
            if (i == Element) {
                count++;
            }
            else count -= 1;
        }
        return Element;
    }
}
