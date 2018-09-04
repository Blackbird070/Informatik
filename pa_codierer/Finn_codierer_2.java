package pa_codierer;

public class Finn_codierer_2 {

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

    public static void funktion(short[] x) {
        for (int i = 0; i < x.length; i += 3) {
            x[i] = (short)(Math.sin(Math.toRadians((double)x[i])*100));
        }
        for (int i = 1; i < x.length; i += 3) {
            x[i] = (short) (Math.pow(x[i], 2.0));
        }
        for (int i = 2; i < x.length; i += 3) {
            x[i] = (short)(Math.cos((double)x[i])*10);
        }
    }


    public static long faktorial(int i) {
        long a = 1;
        for (int k = 1; k <= i; k++) {
            a *= k;
        }
        return a;
    }

    public static void main(String[] arg) {
        short[] x = convert(stringToChar("leon is the capital of the province of leon located in the northwest of spain Its city population of xxx makes it the largest municipality in the province accounting for more than one quarter of the provinces population Including the metropolitan area the population is estimated at xxx"));
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+ " ");
        }

        System.out.println("\n----------------------------------");

        funktion(x);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+ " ");
        }

    }


}
