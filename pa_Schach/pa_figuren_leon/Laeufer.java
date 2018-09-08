package pa_Schach.pa_figuren_leon;

import pa_Schach.Feld;

import java.util.ArrayList;

public class Laeufer extends Schachfigur {

    public Laeufer(int farbe) {
        super(4, farbe);
    }

    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {
        return null;
    }
}
