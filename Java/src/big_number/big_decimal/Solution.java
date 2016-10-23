package big_number.big_decimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by andrey on 22/10/16.
 */
public class Solution {

    public static void main(String[] args) {

        BigInteger a=new BigInteger("0");


        int n = 3;
        String s[] = {"1", ".1", "0.1"};

        s = Arrays.copyOf(s, 3);

        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                BigDecimal bd1 = new BigDecimal(o1);
                BigDecimal bd2 = new BigDecimal(o2);

                return bd1.compareTo(bd2);
            }
        }));

        for (String s1 : s) {
            System.out.println(s1);
        }

    }


}
