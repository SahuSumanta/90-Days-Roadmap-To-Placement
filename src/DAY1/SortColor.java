package DAY1;

import java.util.Arrays;

public class SortColor {


    public static void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:{
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;

                    low++;mid++;
                    break;
                }
                    
                case 1:{
                    mid++;
                    break;
                }
            
                case 2:{
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }

        
        
    }
    // private static void swap(int nums[],int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }
    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
