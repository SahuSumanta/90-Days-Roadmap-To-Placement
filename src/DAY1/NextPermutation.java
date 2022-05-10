package DAY1;


/**
 * NextPermutation
 */
public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        //edge casse
        if (nums == null || nums.length <= 1) return;


        //Step 1 & 2
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--;
            if (i >= 0) {
                int j = nums.length-1;
                while (nums[j] <= nums[i]) j--;
                    swap(nums, i, j);
            }
            reverse(nums, i+1, nums.length-1);
    }
    
    
    //swap
    public static void swap(int[] nums, int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    //reverse
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }





    public static void main(String[] args) {

        int[] arr = {1,2,3};
        nextPermutation(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        } 
        
        
    }
}