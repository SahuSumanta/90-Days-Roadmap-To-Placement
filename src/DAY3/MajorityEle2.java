package DAY3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MajorityEle2 {
    public static void main(String[] args) {
        int[] arr = {2,2};
        System.out.println(majorityElement(arr));
    
    }

//1    //Brute Force  Time Complexity: O(n^2) Space Complexity: O(1)

    /* public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if(nums[j] == nums[i]) count++;
            }
            if (count > n/3) {
                ans.add(nums[i]);
            }
        }
        return ans;
    } */

//2    //Time Complexity: O(n) Space Complexity: O(n)

    /* public static List<Integer> majorityElement(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for (Integer integer : map.keySet()) {
            if(map.get(integer) > n/3){
                ans.add(integer);
            }
        }
        return ans;
    } */

//3    //Time Complexity: O(n) Space Complexity: O(1)

    public static List<Integer> majorityElement(int[] nums){
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == num1){  
                count1++;
            }
            else if (nums[i] == num2){ 
                count2++;
            }
            else if (count1 == 0){ 
                num1 = nums[i]; 
                count1++;
            }
            else if (count2 == 0){
                num2 = nums[i]; 
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == num1)
              count1++;
            else if (nums[i] == num2)
              count2++;
        }

        if (count1 > n/3) {
            ans.add(num1);
        }
        if (count2 > n/3) {
            ans.add(num2);
        }

        return ans;
    }

}
