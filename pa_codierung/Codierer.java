package pa_codierung;

import java.util.ArrayList;
import java.util.Arrays;
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

//        String input = ("Homosexuelles Verhalten homosexuelles Begehren und die Sexuelle Identitaet fallen nicht zwingend zusammen und werden deshalb in der Forschung unterschieden In der Umgangssprache werden diese Aspekte jedoch haeufig vermischt oder miteinander gleichgesetzt Sexuelle Handlungen zwischen Maennern und zwischen Frauen wurden in verschiedenen Epochen und Kulturen ganz unterschiedlich behandelt: teils befuerwortet und toleriert teils untersagt und verfolgt Eine besondere Rolle spielen dabei die drei Abrahamitischen Weltreligionen deren Schriftgelehrte den sexuellen Verkehr zwischen Maennern auf der Basis von Bibel Tora und Koran in der Regel als Suende betrachteten auch wenn liberale Stroemungen mit dieser exegetischen Tradition heute zunehmend brechen Gleichgeschlechtliche Liebe und Lust sind in allen Gesellschaften und historischen Epochen durch entsprechende Quellen nachweisbar Dagegen gilt die Entstehung der sexuellen Identitaet im Sinne einer klaren Festlegung des Individuums auf eine bestimmte sexuelle Orientierung heute als das Resultat von Entwicklungen der modernen Gesellschaft Diese setzten ungefaehr im Jahrhundert unserer Zeitrechnung ein und umfassen Aspekte wie das Staedtewachstum die Buerokratisierung und die kapitalistische Versachlichung sozialer Beziehungen Parallel zur Herausbildung heterosexistischer Normen in der Mehrheitsgesellschaft entstanden nach und nach in fast allen europaeischen Metropolen abgegrenzte schwule Subkulturen deren Angehoerige schon bald zum Gegenstand polizeilicher ueberwachung staatlicher Verfolgung krimineller Erpressung und teilweise auch gewaltsamer uebergriffe wurden");
//
//        String s =  Codierer.encode(input, new Complex_KeyCode(new int[]{19,3,8,23,21,12}));
//        System.out.println(s);
//
//
//        printHashMap(occurencies(s,0,6));
//
//        String s1 = Codierer.decode(s, new Complex_KeyCode(new int[]{1,2,3}));
//        System.out.println(s1);
//


        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);

        System.out.println(list);

        list.remove(new Integer(3));

        System.err.println(list.get(0));

        System.out.println(list);



        int[] ar = new int[]{2,3,6};
        ar[1] = 0;

        System.err.println(ar[0]);

        System.out.println(Arrays.toString(ar));
        /*
         *
         *
         */

    }
}
