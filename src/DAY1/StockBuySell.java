package DAY1;

public class StockBuySell {


//Optimize Approach TC = O(n) SC = O(1)

    public static int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]); //update min price
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }

    // Brute Forrce 
    // TC = O(n^2)
    // SC = O(1)
    /*public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    sum = prices[j]-prices[i];

                    if(sum > max){
                        max = sum;
                    }
                }
            }   
        }

        return max;    
    }*/



    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
