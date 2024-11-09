//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution{
    public static void main(String[] args) {
        Solution solution = new Solution();
        double result = solution.pow(2.0, 10);
        System.out.println("2.0 raised to the power of 10 is:" + result);
    }
         public double pow(double x, int n) {
                // Base case: anything raised to the power 0 is 1
                if (n == 0) {
                    return 1.0;
                }

                // If n is negative, convert to positive and calculate reciprocal
                if (n < 0) {
                    x = 1 / x;
                    n = -n;
                }
                // Recursive case
                double half = pow(x, n / 2);

                // If n is even, multiply half with itself
                if (n % 2 == 0) {
                    return half * half;
                } else {
                    // If n is odd, multiply one more time by x
                    return half * half * x;
                }
            }
        }


