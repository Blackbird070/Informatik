package pa_codierer;

public class Codierer {



    public static char[] stringToChar(String x){
        String s = x.toUpperCase();

        char[] a = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            a[i] = s.charAt(i);
        }
        return a;
    }



    public static void main(String[] arg){
        short[] ar = convert(stringToChar("Leon hat den größten"));

        encode(ar);

        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println(backToBack(ar));

        decode(ar);
        System.out.println(backToBack(ar));

    }

    public static void encode(short[] ar){
        for(int i = 0; i < ar.length; i++){
            ar[i] = (short) ((ar[i] + 1) % 27);
        }
    }

    public static void decode(short[] ar){
        for(int i = 0; i < ar.length; i++){
            ar[i] = (short) ((ar[i] - 1) % 27);
        }
    }

    public static short[] convert(char[] chars){
        short[] a = new short[chars.length];
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' ') {
                a[i] = 0;
            }else{
                a[i] = (short)(chars[i] - 64);
            }
        }
        return a;
    }

    public static String backToBack(short[] a){
        String s = "";
        for(short sh:a){
            if(sh == 0) s += " ";
            else{
                s += (char)(64 + sh);
            }
        }
        return s;
    }







}
