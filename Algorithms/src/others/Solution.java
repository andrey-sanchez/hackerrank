package others;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrey on 22/10/16.
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


    static int[] cutSticks(int[] lengths) {
        List<Integer> ret = new ArrayList<>();
        while(true){
            int cutLength = 0;

            for(int i=0;i<lengths.length;i++){
                if(cutLength==0){
                    cutLength = lengths[i];
                }else if(lengths[i]>0&&lengths[i]<cutLength){
                    cutLength = lengths[i];
                }
            }

            if(cutLength == 0){
                break;
            }

            int cont =0;
            for(int i=0;i<lengths.length;i++){
                if(lengths[i]>0){
                    lengths[i]=lengths[i]-cutLength;
                    cont++;
                }
            }

            ret.add(cont);
        }


        int []retArray = new int[ret.size()];

        for(int i=0;i<ret.size();i++){
            retArray[i]=ret.get(i);
        }


        return retArray;


    }

/*
 * Complete the function below.
 */

    static void fizzBuzz(int n) {

        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }

}
