package pa_Schach;

import java.util.ArrayList;

public abstract class Schachfigur {

    int typ;
    int farbe;


    public Schachfigur(int typ, int farbe) {
        this.typ = typ;
        this.farbe = farbe;
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
