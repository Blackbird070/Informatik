package pa_codierer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Finn_codierer_3 {

    


    public static char[] stringToChar(String x) {
        String s = x.toUpperCase();

        char[] a = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        return a;
    }

    public static short[] convert(char[] chars) {
        short[] a = new short[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                a[i] = 0;
            } else {
                a[i] = (short) (chars[i] - 64);
            }
        }
        return a;
    }


<<<<<<< Updated upstream
    public static short[] keyEncode(short[] s, int key){
        short[] finish = new short[s.length];
        for(int i = 0; i < s.length; i++){
            finish[i] = (short)((s[i] + key) % 27);
        }
        return finish;
    }

    public static String backToBack(short[] a){
        String s = "";
        for(short sh:a){
            if(sh == 0) s += " ";
            else{
                s += (char)(64 + sh);
            }
=======
    public static void funktion(short[] x) {
        int i;

        short[] finish = new short[x.length];


        for (i = 0; i < x.length; i += 3) {
            finish[i] = x[(i + 3) % x.length];
        }
        for (i = 1; i < x.length; i += 3) {
            finish[i] = x[(i + 3) % x.length];
        }
        for (i = 2; i < x.length; i += 3) {
            finish[i] = x[(i + 3) % x.length];
>>>>>>> Stashed changes
        }
        return s;
    }


        for(i = 0; i < x.length; i++){
            x[i] = finish[i];
        }


    public static void main(String[] arg) {
        short[] x = convert(stringToChar("leon is the capital of the province of leon located in the northwest of spain Its city population of  makes it the largest municipality in the province accounting for more than one quarter of the provinces population Including the metropolitan area the population is estimated at "));
        System.out.println(Arrays.toString(x));

        System.out.println("\n----------------------------------");
        short[] encode = keyEncode(x , 23);

<<<<<<< Updated upstream
        System.out.println(Arrays.toString(encode));
        System.out.println(backToBack(encode));
=======
        funktion(x);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }




>>>>>>> Stashed changes
    }


}
