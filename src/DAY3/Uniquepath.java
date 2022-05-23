package DAY3;

public class Uniquepath {
    public static int uniquePaths(int m, int n) {
        if(m ==1 || n == 1) return 1;
        //recursion
        return uniquePaths(m-1, n)+uniquePaths(m, n-1);

        /*Dynamic Programmin*/
       /* int[][] dp = new int[r][c];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] += dp[i-1][j]+dp[i][j-1];
                }
            }

        }
        return dp[r-1][c-1]; */
    }

    public static void main(String[] args) {
        int m = 3, n =7;
        System.out.println(uniquePaths(m, n));
    }
}
