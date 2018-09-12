package pa_Schach.pa_figuren_leon;

import pa_Schach.Feld;

import java.util.ArrayList;

public class Pferd extends Schachfigur {


    public Pferd(int farbe) {
        super(3, farbe);
    }


    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {
        ArrayList<Feld> mFelder = new ArrayList<>();
        int x = this.getFeld().getX();
        int y = this.getFeld().getY();

        if (x + 1 < 8 && y + 2 < 8) {
            if (a[x + 1][y + 2].getFigur() == null || getFarbe() != a[x + 1][y + 2].getFigur().getFarbe()) {
                mFelder.add(a[x + 1][y + 2]);
            }
        }
        if (x + 1 < 8 && y - 2 >= 0) {
            if (a[x + 1][y - 2].getFigur() == null || getFarbe() != a[x + 1][y - 2].getFigur().getFarbe()) {
                mFelder.add(a[x + 1][y - 2]);
            }
        }
        if (x - 1 >= 0 && y + 2 < 8) {
            if (a[x - 1][y + 2].getFigur() == null || getFarbe() != a[x - 1][y + 2].getFigur().getFarbe()) {
                mFelder.add(a[x - 1][y + 2]);
            }
        }
        if (x - 1 >= 0 && y - 2 >= 0) {
            if (a[x - 1][y - 2].getFigur() == null || getFarbe() != a[x - 1][y - 2].getFigur().getFarbe()) {
                mFelder.add(a[x - 1][y - 2]);
            }
        }
        if (x + 2 < 8 && y + 1 < 8) {
            if (a[x + 2][y + 1].getFigur() == null || getFarbe() != a[x + 2][y + 1].getFigur().getFarbe()) {
                mFelder.add(a[x + 2][y + 1]);
            }
        }
        if (x + 2 < 8 && y - 1 >= 0) {
            if (a[x + 2][y - 1].getFigur() == null || getFarbe() != a[x + 2][y - 1].getFigur().getFarbe()) {
                mFelder.add(a[x + 2][y - 1]);
            }
        }
        if (x - 2 >= 0 && y + 1 < 8) {
            if (a[x - 2][y + 1].getFigur() == null || getFarbe() != a[x - 2][y + 1].getFigur().getFarbe()) {
                mFelder.add(a[x - 2][y + 1]);
            }
        }
        if (x - 2 >= 0 && y - 1 >= 0) {
            if (a[x - 2][y - 1].getFigur() == null || getFarbe() != a[x - 2][y - 1].getFigur().getFarbe()) {
                mFelder.add(a[x - 2][y - 1]);
            }
        }

        return mFelder;
    }
}
