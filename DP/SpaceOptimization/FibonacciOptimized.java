package DP.SpaceOptimization;


public class FibonacciOptimized {

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int prev = 1;
        int prev2 = 0;

        int curr = 0;
        for (int i = 2; i <= n; i++) {
            curr = prev + prev2;

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(fib(n));
    }
}
