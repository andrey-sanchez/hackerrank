package others.sub_matrix_median;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        new Solution().subMatrixMedian();
    }

    public void subMatrixMedian() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] m = loadMatrix(scanner, n);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {

            int[] subMatrixArray = loadSubMatrixArray(scanner, q, m);

            int median = getMedian(subMatrixArray);

            System.out.println(median);
        }
    }

    private int getMedian(int[] array) {

//        Arrays.sort(array);
        int median;
        int l = array.length;
        if (l % 2 == 0) {
//            median =  (array[(l / 2) - 1] + array[l / 2]) / 2;
            median = (select(array, (l / 2) - 1) + select(array, l / 2)) / 2;
        } else {
//            median = array[l / 2];
            median = select(array, l / 2);
        }

        return median;
    }


    private int[] loadSubMatrixArray(Scanner scanner, int q, int[][] m) {
        int r1, c1, r2, c2;
        r1 = scanner.nextInt() - 1;
        c1 = scanner.nextInt() - 1;
        r2 = scanner.nextInt();
        c2 = scanner.nextInt();

        int[] array = new int[(r2 - r1) * (c2 - c1)];
        int i = 0;
        for (int r = r1; r < r2; r++) {
            for (int c = c1; c < c2; c++) {
                array[i] = m[r][c];
                i++;
            }
        }


        return array;
    }

    private int[][] loadMatrix(Scanner scanner, int n) {
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = scanner.nextInt();
            }
        }

        return m;
    }

    private int select(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        Random rand = new Random();
        while (right >= left) {
            int pivotIndex = partition(arr, left, right, rand.nextInt(right - left + 1) + left);
            if (pivotIndex == n) {
                return arr[pivotIndex];
            } else if (pivotIndex < n) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
        return 0;
    }

    private int partition(int[] arr, int left, int right, int pivot) {
        int pivotVal = arr[pivot];
        swap(arr, pivot, right);
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivotVal) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }
        swap(arr, right, storeIndex);
        return storeIndex;
    }

    private void swap(int[] arr, int i1, int i2) {
        if (i1 != i2) {
            int temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;
        }
    }

}