package dynamic_programming.fibonacci_modified;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/fibonacci-modified
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        new Solution().fibonacciModified();
    }

    private void fibonacciModified() {

        Scanner scanner = new Scanner(System.in);

        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int n = scanner.nextInt();

        BigInteger[] fibs = new BigInteger[n];
        fibs[0] = new BigInteger(String.valueOf(t1));
        fibs[1] = new BigInteger(String.valueOf(t2));


        calculateFib(fibs, n);

        System.out.println(fibs[n - 1]);

    }

    private void calculateFib(BigInteger[] fibs, int n) {

        for (int i = 2; i < n; i++) {
            fibs[i] = fibs[i - 1].multiply(fibs[i - 1]).add(fibs[i - 2]);
        }
    }


}
