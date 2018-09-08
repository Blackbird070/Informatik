package pa_Schach.pa_figuren_finn;

import pa_Schach.Feld;
import pa_Schach.pa_figuren_leon.Schachfigur;

import java.util.ArrayList;

public class Turm extends Schachfigur{

    public Turm(int farbe){
        super(2, farbe);
    }

    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {
        return null;
    }
}
