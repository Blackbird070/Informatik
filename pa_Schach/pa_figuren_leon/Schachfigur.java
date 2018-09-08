package pa_Schach.pa_figuren_leon;

import pa_Schach.Feld;

import java.util.ArrayList;

public abstract class Schachfigur {

    private int typ;
    private int farbe;
    private Feld feld;


    public Schachfigur(int typ, int farbe) {
        this.typ = typ;
        this.farbe = farbe;
    }

    public Feld getFeld() {
        return feld;
    }

    public void setFeld(Feld feld) {
        this.feld = feld;
    }

    public abstract ArrayList<Feld> möglicheFelder(Feld[][] a);



    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public int getFarbe() {
        return farbe;
    }

    public void setFarbe(int farbe) {
        this.farbe = farbe;
    }
}
