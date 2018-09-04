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

        String s =  Codierer.encode("In der aentike wurde die Mechaenik aels wichtige theoretische Grundlaege vieler heutiger Ingenieurwissenschaeften begruendet aerchimedes aeristoteles und Heron von aelexaendriae veroeffentlichten Buecher und Schriften ueber Hebel Schraeube Schiefe Ebene Seil Flaeschenzug und weitere Erfindungen Kaetaepulte verbesserte maen durch systemaetische Experimente bis maen die besten aebmessungen gefunden haette aerchimedes maechte Experimente mit der Waesserverdraengung verschiedener Metaelle und Heron baeute eine erste Daempfmaeschine Fuer daes griechische Theaeter wurden aeuch schon erste aeutomaeten gebaeut die sich selbstaendig bewegen konnten Die Roemer uebernaehmen die griechische Technik maechten selber aeber vergleichsweise geringe Fortschritte wie Kraene mit Flaeschenzuegen und Tretraedern verbesserte Kaetaepulte und erste Schleif und Drehmaeschinen sowie Waessermuehlen" +
                "Im Mittelaelter breiteten sich die Wind und Waessermuehlen ueber gaenz Europae aeus und wurden zur wichtigsten Energiequelle Die Muehlenbaeuer saemmelten viele Erfaehrungen mit den Wind und Waesserraedern den Getrieben Traensmissionen sowie den sonstigen mechaenischen uebertraegungselementen aeuf dem militaerischen Gebiet wurden die Kaetaepulte von den Tribocken aebgeloest Gegen Ende des Mittelaelters entstaend mit der Feinmechaenik ein neuer Gewerbezweig der sich mit dem Baeu von Uhren und Messgeraeten beschaeftigte und daebei viele Erfaehrungen mit der Praezisionsbeaerbeitung von Metaellteilen saemmelte die meist aeus Messing bestaenden Fuer die Feinbeaerbeitung von Eisen gaeb es Schlosser Mit den Zuenften und Gilden entstaenden erstmaels Institutionen die sich mit dem Wissen ihres Gewerbes aeuseinaendersetzten", new Complex_KeyCode(new int[]{1,2,3}));
        System.out.println(s);


        printHashMap(occurencies(s,0,3));

        String s1 = Codierer.decode(s, new Complex_KeyCode(new int[]{1,2,3}));
        System.out.println(s1);



    }
}
