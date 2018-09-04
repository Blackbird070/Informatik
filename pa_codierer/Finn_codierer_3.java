package pa_codierer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Finn_codierer_3 {


    public static short[] stringToShort(String x) {
        x = x.toUpperCase();
        short[] ar = new short[x.length()];
        for (int i = 0; i < ar.length; i++) {
            if (x.charAt(i) == ' ') {
                ar[i] = 0;
            } else {
                ar[i] = (short) (x.charAt(i) - 64);
            }
        }
        return ar;
    }

    public static String shortToString(short[] ar) {
        String s = "";
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) s += ' ';
            else {
                s += (char) (ar[i] + 64);
            }
        }
        return s;
    }

    public static short[] keyEncode(short[] s, int key) {
        short[] finish = new short[s.length];
        for (int i = 0; i < s.length; i++) {
            finish[i] = (short) ((s[i] + key) % 27);
        }
        return finish;
    }




    public static void main(String[] arg) {
        short[] x = stringToShort("leon is the capital of the province of leon located in the northwest of spain Its city population of  makes it the largest municipality in the province accounting for more than one quarter of the provinces population Including the metropolitan area the population is estimated at ");
        System.out.println(Arrays.toString(x));

        System.out.println("\n----------------------------------");
        short[] encode = keyEncode(x, 23);

        System.out.println(Arrays.toString(encode));
        System.out.println(shortToString(encode));



    }


}
