package pa_codierer;

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


    public static void funktion(short[] x) {
        int i;

        for (i = 0; i < x.length; i += 3) {
            x[i] = x[(i + 3) % x.length];
        }
        for (i = 1; i < x.length; i += 3) {
            x[i] = x[(i + 3) % x.length];
        }
        for (i = 2; i < x.length; i += 3) {
            x[i] = x[(i + 3) % x.length];
        }


    }

    public static void main(String[] arg) {
        short[] x = convert(stringToChar("abcdefg"));
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        System.out.println("\n----------------------------------");

        funktion(x);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

    }


}
