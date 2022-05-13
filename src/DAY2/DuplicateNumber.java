package DAY2;



public class DuplicateNumber {

    public static int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

}
