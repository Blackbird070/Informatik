package pa_Schach.pa_figuren_finn;

import pa_Schach.Feld;
import pa_Schach.pa_figuren_leon.Schachfigur;

import java.util.ArrayList;

public class Koenig extends Schachfigur {

    public Koenig(int farbe) {
        super(6, farbe);
    }

    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {

        ArrayList<Feld> felder = new ArrayList<>();

        for(int x = Math.max(0, this.getFeld().getX() - 1); x <= Math.min(7, this.getFeld().getX() + 1); x++){
            for(int y = Math.max(0, this.getFeld().getY() - 1); y <= Math.min(7, this.getFeld().getY() + 1); y++){
                if(x != getFeld().getX() || y != getFeld().getY()){
                    if(a[x][y].getFigur() != null){
                        if(a[x][y].getFigur().getFarbe() != this.getFarbe()){
                            felder.add(a[x][y]);
                        }
                    }else{
                        felder.add(a[x][y]);
                    }
                }
            }
        }

        return felder;
    }
}
