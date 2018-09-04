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
        short[] x = stringToShort("Die photosynthetischen Bakterien Chloroflexaceae Chlorobiaceae Chromatiaceae Heliobacteria Chloracidobacterium können ein viel größeres Spektrum an Reduktantien nutzen vorwiegend nutzen sie jedoch Schwefelwasserstoff HS Auch viele Cyanobakterien können Schwefelwasserstoff als Reduktans verwenden Da in diesem Fall A für den im Schwefelwasserstoff gebundenen Schwefel steht wird bei dieser Art der bakteriellen Photosynthese elementarer Schwefel S und kein Sauerstoff freigesetzt Diese Form der Photosynthese wird deshalb anoxygene Photosynthese genannt"+
                "Einige Cyanobakterien können auch zweiwertige Eisenionen als Reduktans nutzen"+
                "Auch wenn bei oxygener und anoxygener Photosynthese unterschiedliche Reduktantien verwendet werden so ist doch beiden Prozessen gemein dass durch deren Oxidation Elektronen gewonnen werden Unter Ausnutzung dieser mit Lichtenergie auf ein hohes Energieniveau niedriges Redoxpotential gebrachten Elektronen werden die energiereichen Verbindungen ATP und NADPH gebildet mittels derer aus CO energiereiche organische Stoffe synthetisiert werden können" +
                "Der bei der Synthese der energiereichen organischen Verbindungen benötigte Kohlenstoff kann aus Kohlenstoffdioxid CO oder aus einfachen organischen Verbindungen z B Acetat gewonnen werden Im ersten Fall spricht man von Photoautotrophie Der weitaus größte Teil der phototrophen Organismen ist photoautotroph Zu den photoautotrophen Organismen gehören z B alle grünen Landpflanzen und Algen Bei ihnen ist eine phosphorylierte Triose das primäre Syntheseprodukt und dient als Ausgangsmaterial für den nachfolgenden Aufbau von Bau und Reservestoffen d h verschiedenen Kohlenhydraten Photoautotrophe treiben mit ihrem PhotosyntheseStoffwechsel direkt und indirekt nahezu alle bestehenden Ökosysteme an da sie mit dem Aufbau organischer Verbindungen aus anorganischem CO anderen Lebewesen energiereiche Baustoff und Energiequellen liefern Werden einfache organische Verbindungen als Ausgangsstoffe genutzt bezeichnet man diesen Prozess der nur bei Bakterien vorkommt als Photoheterotrophie ");
        System.out.println(Arrays.toString(x));

        System.out.println("\n----------------------------------");
        short[] encode = keyEncode(x, 23);

        System.out.println(Arrays.toString(encode));
        System.out.println(shortToString(encode));



    }


}
