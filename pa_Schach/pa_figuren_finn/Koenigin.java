package pa_Schach.pa_figuren_finn;

import pa_Schach.Feld;
import pa_Schach.pa_figuren_leon.Schachfigur;

import java.util.ArrayList;

public class Koenigin extends Schachfigur {

    public Koenigin(int farbe) {
        super(5, farbe);
    }

    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {
        return Koenigin.möglicheFelder_directions(a, this.getFeld(),
                new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}, {1,1}, {-1,1}, {1,-1}, {-1,-1}});
    }


    public static ArrayList<Feld> möglicheFelder_directions(Feld[][] a, Feld position, int[][] directions){
        ArrayList<Feld> felder = new ArrayList<>();
        for(int[] dir: directions){
            Feld current = getFeld(a, position.getX() + dir[0], position.getY() + dir[1]);
            loop:
            while(current != null){
                if(current.getFigur() != null){
                    if(current.getFigur().getFarbe() != position.getFigur().getFarbe()){
                        felder.add(current);
                    }
                    break loop;
                }
                felder.add(current);
                current = getFeld(a, current.getX() + dir[0], current.getY() + dir[1]);
            }
        }
        return felder;
    }

    public static Feld getFeld(Feld[][] a, int x, int y){
        if(x < 0 || x > 7 || y < 0 || y > 7){
            return null;
        }
        return a[x][y];
    }
}
