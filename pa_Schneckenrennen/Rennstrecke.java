package pa_Schneckenrennen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Rennstrecke {
    private String typ;
    private int length;
    private Rennschnecke[] snails;
    private int next = 1;

    public Rennstrecke() {
        this.length = (int)(Math.random()*180+30);
        if(this.length <= 80){
            this.typ = "Sprint";
            this.snails = new Rennschnecke[4];
            for(int i = 0; i < 4; i++){
                Rennschnecke a = new Rennschnecke("Snail" + i);
                snails[i] = a;
            }
        }else{
            this.typ = "Marathon";
            this.snails = new Rennschnecke[12];
            for(int i = 0; i < 12; i++){
                Rennschnecke a = new Rennschnecke("Snail" +i);
                snails[i] = a;
            }
        }
    }

    @Override
    public String toString() {
        return "Rennstrecke{" +
                "typ='" + typ + '\'' +
                ", length=" + length +
                ", snails=" + Arrays.toString(snails) +
                '}';
    }

    public boolean update(){
        boolean finish = true;
        for (Rennschnecke i :snails) {
            if(i.getWay() >= this.length){

                if(i.getPlace() == 0){
                    i.setPlace(next);
                    next++;
                }
            }else{
                i.update();
                finish = false;
            }
        }
        return finish;
    }

    public void printPlaces(){

        ArrayList<Rennschnecke> sc = new ArrayList<>();
        for(Rennschnecke r:snails){
            sc.add(r);
        }
        sc.sort(new Comparator<Rennschnecke>() {
            @Override
            public int compare(Rennschnecke o1, Rennschnecke o2) {
                if(o1.getPlace() > o2.getPlace()) return 1;
                if(o1.getPlace() < o2.getPlace()) return -1;
                return 0;
            }
        });
        for(Rennschnecke r:sc){
            System.out.println(r.getPlace() + "    "+ r.getName() + "    " + r.getvMax() + "    " + r.getWay());
        }

    }

    public static void main(String[] arg){
        Rennstrecke ersteRennstrecke = new Rennstrecke();
        while(ersteRennstrecke.update() == false){

        }

        ersteRennstrecke.printPlaces();
    }



}
