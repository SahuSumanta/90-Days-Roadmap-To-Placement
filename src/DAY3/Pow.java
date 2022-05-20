package DAY3;

public class Pow {

    /*public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }*/

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    
    /*public static double myPow(double x, int n) {
        double  ans = 1.0;
        for (int i = 0; i < n; i++) {
            ans *= x;
        }
        return ans;
    }*/

    
//Time Complexity: O(log n) Space Complexity: O(1)

    public static double myPow(double x, int n){
        double ans = 1.0;
        int nn = n;

        if (nn < 0) {
            nn *= -1;
        }

        while (nn > 0) {
            if(nn%2 == 1){
                ans *= x;
                nn--;
            }
            else{
                x = x*x;
                nn= nn / 2;
            }
        }

        if (n < 0) ans = (double)(1.0) / (double)(ans);
        return ans;
    }



    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
        
    }
}
