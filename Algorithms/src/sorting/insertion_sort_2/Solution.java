package sorting.insertion_sort_2;

/**
 * https://www.hackerrank.com/challenges/insertionsort2
 */
public class Solution {
    public static void main(String[] args) {
        insertionSortPart2(new int[]{1, 4, 3, 5, 6, 2});
    }

    public static void insertionSortPart2(int[] ar) {
        // Fill up the code for the required logic here
        // Manipulate the array as required
        // The code for Input/Output is already provided


        int size = ar.length;

        for (int i = 1; i < size; i++) {

            int pos = i;
            int e = ar[pos];

            while (pos > 0) {
                if (ar[pos - 1] > e) {
                    ar[pos] = ar[pos - 1];
                } else {
                    break;
                }
                pos--;
            }

            ar[pos] = e;

            printArray(ar);

        }
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
