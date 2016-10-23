package dynamic_programming.max_subarray;

import java.math.BigDecimal;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/maxsubarray
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        new Solution().maxSubarray();
    }

    private void maxSubarray() {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t > 0) {
            t--;

            int n = scanner.nextInt();

            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                array[i] = a;
            }

            int maxContiguous = getMaxContiguous(array);
            int maxNonContiguous = getMaxNonContiguous(array);


            System.out.println(maxContiguous + " " + maxNonContiguous);
        }
    }

    private int getMaxContiguous(int[] array) {
        int maxContiguous = Integer.MIN_VALUE + 1000000;
        int maxInternal = Integer.MIN_VALUE + 1000000;

        for (int a : array) {
            maxInternal = Math.max(a, maxInternal + a);
            maxContiguous = Math.max(maxInternal, maxContiguous);
        }

        return maxContiguous;
    }

    private int getMaxNonContiguous(int[] array) {
        int maxNonContiguous = Integer.MIN_VALUE + 1000000;
        for (int a : array) {
            maxNonContiguous = Math.max(maxNonContiguous, maxNonContiguous + a);
            maxNonContiguous = Math.max(a, maxNonContiguous);
        }

        return maxNonContiguous;
    }
}
