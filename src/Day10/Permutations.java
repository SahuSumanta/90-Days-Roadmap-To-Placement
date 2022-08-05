package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 
 * TC = N! * N
 * SC = O(N)+O(N)
 * 
 */
public class Permutations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Permutations obj = new Permutations();
        System.out.println(obj.permute(arr));

        sc.close();
        
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        recurpermute(nums, ds, ans, freq);
        return ans;
        
    }

    private void recurpermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        //Base case
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurpermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] =false;
            }
        }
    }


}
