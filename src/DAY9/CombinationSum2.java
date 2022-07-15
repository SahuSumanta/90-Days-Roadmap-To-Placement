package DAY9;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum2(arr, target);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;

    }

    public static void findCombination(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> temp) {

        // base case
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1])
                continue; // code to not pick duplicate eliment
            if (arr[i] > target)
                break;

            temp.add(arr[i]);
            findCombination(i + 1, arr, target - arr[i], ans, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
