package pa_codierer;

import java.util.HashMap;
import java.util.Set;

public class Analyser {

    public static HashMap<Short, Integer> occurencies(short[] ar, int start, int step) {
        HashMap<Short, Integer> hashMap = new HashMap<>();

        Set<Short> keys = hashMap.keySet();

        for(int i = start; i < ar.length; i+= step){
            short c = ar[i];
            if (keys.contains(new Short(c))) {
                hashMap.put(c, hashMap.get(new Short(c)) + 1);
            }else{
                hashMap.put(c, 1);
            }
        }

        return hashMap;
    }

    public static void printHashMap(HashMap<Short, Integer> map) {
        for (Object a : map.keySet()) {
            System.out.println(a + "   " + map.get(a));
        }
    }


    public static void main(String[] args){
        String s = "HAKJWEOWPDAWZXLEPXHWKBWPDAWLNKREJZAWKBWHAKJWHKZXPA WEJWPDAWJKNPDSAOPWKBWOLXEJWEPOWZEPUWLKLQHXPEKJWKBWWIXGAOWEPWPDAWHXNCAOPWIQJEZELXHEPUWEJWPDAWLNKREJZAWXZZKQJPEJCWBKNWIKNAWPDXJWKJAWMQXNPANWKBWPDAWLNKREJZAOWLKLQHXPEKJWEJZHQ EJCWPDAWIAPNKLKHEPXJWXNAXWPDAWLKLQHXPEKJWEOWAOPEIXPA WXPW";
        short[] ar = Finn_codierer_3.stringToShort(s);
        printHashMap(occurencies(ar, 0, 1));
    }
}
