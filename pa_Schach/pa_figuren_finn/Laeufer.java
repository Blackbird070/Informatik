package pa_Schach.pa_figuren_finn;

import pa_Schach.Feld;
import pa_Schach.pa_figuren_leon.Schachfigur;

import java.util.ArrayList;

public class Laeufer extends Schachfigur {

    public Laeufer(int farbe) {
        super(4, farbe);
    }

    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {
        return Koenigin.möglicheFelder_directions(a, this.getFeld(),
                new int[][]{{1,1}, {-1,1}, {1,-1}, {-1,-1}});
    }

}
