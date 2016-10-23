package strings.super_reduced_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/reduced-string
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        List<Integer> ret = new ArrayList<>();


        String[] pairs = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo", "pp", "qq", "rr", "ss", "tt", "uu", "vv", "ww", "xx", "yy", "zz"};

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        boolean replaced = true;
        while (string.length() > 0 && replaced) {
            replaced = false;

            for (String pair : pairs) {
                if (string.contains(pair)) {
                    string = string.replaceAll(pair, "");
                    replaced = true;
                }
            }
        }

        if (string.length() > 0)
            System.out.println(string);
        else
            System.out.println("Empty String");
    }


}
