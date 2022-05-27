package DAY4;

import java.util.HashMap;

public class XorSubarray {

    public static void main(String[] args) {

        int[] arr ={4, 2, 2, 6, 4};
        int B = 6;
        System.out.println(solve(arr, B));
        
    }

    //Optimal Approach TC = O(N) SC = O(N)
    public static int solve(int[] A, int B){
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
            if (h.get(xor^B) != null) {
                count += h.get(xor^B);
            }
            if (xor == B) {
                count++;
            }

            if (h.get(xor) != null) {
                h.put(xor, h.get(xor) + 1);
            }else{
                h.put(xor, 1);
            }
        }
        return count;
    }

    //Brute Force TC = O(N^2) SC = O(1)
    /* public static int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int cur_bit = 0;
            for (int j = i; j < A.length; j++) {
                cur_bit ^= A[j];
                if (cur_bit == B) {
                    count++;
                }
            }
        }
        return count;
    } */
}
