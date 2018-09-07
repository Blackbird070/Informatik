package pa_Schach;

public class Feld {

    int farbe;
    Schachfigur figur;



    public Feld(int farbe) {
        this.farbe = farbe;
    }

    public int getFarbe() {
        return farbe;
    }

    public void setFarbe(int farbe) {
        this.farbe = farbe;
    }

    public Schachfigur getFigur() {
        return figur;
    }

    public void setFigur(Schachfigur figur) {
        this.figur = figur;
    }

}
