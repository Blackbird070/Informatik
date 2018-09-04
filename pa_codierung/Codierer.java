package pa_codierung;

import java.util.HashMap;
import java.util.Set;

public abstract class Codierer {



    public abstract short[] encode(short[] ar);

    public abstract short[] decode(short[] ar);




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

    public static String encode(String s, Codierer codierer){
        short[] ar = stringToShort(s);
        return shortToString(codierer.encode(ar));
    }

    public static String decode(String s, Codierer codierer){
        short[] ar = stringToShort(s);
        return shortToString(codierer.decode(ar));
    }

    public static HashMap<Character, Integer> occurencies(String ar, int start, int step) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        Set<Character> keys = hashMap.keySet();

        for(int i = start; i < ar.length(); i+= step){
            char c = ar.charAt(i);
            if (keys.contains(new Character(c))) {
                hashMap.put(c, hashMap.get(new Character(c)) + 1);
            }else{
                hashMap.put(c, 1);
            }
        }

        return hashMap;
    }

    public static void printHashMap(HashMap<Character, Integer> map) {
        for (Object a : map.keySet()) {
            System.out.println(a + "   " + map.get(a));
        }
    }



    public static void main(String[] args){

        String s = Codierer.encode("Leon hat einen sehr sehr sehr kleinen Pimmel", new KeyCode(3));
        System.out.println(s);


        printHashMap(occurencies(s,0,1));

        String s1 = Codierer.decode(s, new KeyCode(3));
        System.out.println(s1);



    }
}
