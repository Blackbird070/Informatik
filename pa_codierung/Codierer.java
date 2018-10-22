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

        String s =  Codierer.decode(" RUKMQPXMHFQKCCALTTOAAHL RUKMQPXMHFQKCJAAQ UMJUFFGH CQSVMTOQDOMWCPXQAENMXWHBVXDHVWHUVKAWTHAQOAHPSBBOVYEHVWOZWCDALPXQH ZD DTYUUFCLALLYRZOXTMQOWOZLHZOXTAHLAHLAQH ZCSXUCVZZV LLMVKMWQQJGMJUPAH AUMKSMGNQSMM IO CPXZFYLOWPQJPQOXTLCW ZCSPQPZUFDV ZCSJTACO JMOZERWHOZIMHTHZL DV FFFJMJUKOL ZBQFCUXZZFHZJUFFGHVQUKFPAHLYUIQZZSZBNYQFCQJUGXU ZBUXGMJZZSHXKXTXQHQHPSNBHNFJHVWAMFBHQHEXU ZBUXGTEXTSEMDVZWHTPOLLHQHMLUHNQZCORZPZESXV UEGOMNCQJWHPZUDVHQHEXU XAESXV UGXUNKFSLCMEHQSEMOIZWHZAUCGOTAUDHLMHZZSGIYZUSGQAUPJHQWVNJDPXGULL ZBQFCDAFEJHTEAUGQMJUPXUMJUDVKZE EZHTABCLHH ZZSVMTOQDOMJUGXUSABCSBDEMO HVWGMXQVALZSDBBUPXUHYVDAVHRIZSEQYZXSWWNVLMQLWE JDVWCZSGMNUCXJMHUMDVHOOQFGMWWQLUIZBEXWMJUMMFPWQQFQHHCNXUIHZLKWZKZYMQOAHLELAWYUXVMNUQPHOANUKFPAHLLUI CEARVWBQMWMWTFFHPIZZWCJNZO HVWAXXLKDAQKFPHZO WTEXTXCTEZNXCBJYLDX PUDAQLWCZSDTHZZSJMOZXDVKDVRLHVWOZWCPEMEGUQOXTXQHAJ VKMJUPMUKDUQFW LLQVKMJYQSTBAFXXQHJVO ZMEMNTUH VSXJMJUSAOAWYUXCMJNDLHPQHSSGMNUDX BAFXXQHEYQFWQPVQLCQIUDAQVAUQAQMNUWDDZAHLYH PFQZXVCUPXVHEHPAYQ OFEVHXORSHQJZLUH PCYEWMWMQPXMHFQSRZEZZLLMNOZZCPAOEXCIHMLWD WLQKXTPVESYWJUQFWDEXWDXVCZZSGMNUYGGMNHQFCOAMQDO ZBMYWH CQKHHOZERWMJUFFJMBVQ UHEGLBDPNBFFGMNNLMQ ALQJCGACEJHKDHFFJHACZSXV UFEIIOMQFCIOJQCWMWQUXCLXMLKWIAYEXZIZBDLXUWYUXCJQZCGNZXNUKLMNOZZCBJYLWLMWEMHLAXFUKWQOXTXCCALDTFPHCO XVCUDGBQXFQJCJATUXKBJAQFCXXLMDOMHUKMUHDZCTX YCXWXVCUTXWMNIDX QONUKFPALLFRZIZZSLVWYQJCUABC HQPMSXVMHFDVKIBNLXQAONMFGMJUZTFPWOZWCVXXTSLVW MKWHXFXXQHAOCGSIACDVKMJUYXWZKJ DHVWVNZHONZZRWMWMO ZBHZLKXJGOXLXZAHLWHZAHLTQOAB XUQCZLKFPKHLUDT UKMPHCZSXQ PVZWCXKFURHQHCO HZWOQUHZSVO XVCUDLDIPFUVKMNUGXUNKFSMQOWECAPQJZXDHZWZCHUMOMFFJHQHPSWMEFHXL AUMMFPWAQODTPMMEHZWOQUHZCLUYIMWQFJGMJ", new Complex_KeyCode(new int[]{19,3,8,23,21,12}));
        System.out.println(s);

    }
}
