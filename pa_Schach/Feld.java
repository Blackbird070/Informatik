package pa_Schach;

import pa_Schach.pa_figuren_leon.Schachfigur;

public class Feld {

    private Schachfigur figur;
    private int x;
    private int y;


    public Feld(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Schachfigur getFigur() {
        return figur;
    }

    public void setFigur(Schachfigur figur) {
        this.figur = figur;
    }


}
