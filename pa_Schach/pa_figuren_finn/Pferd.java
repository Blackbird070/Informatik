package pa_Schach.pa_figuren_finn;

import pa_Schach.Feld;
import pa_Schach.pa_figuren_leon.Schachfigur;

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

        int[][] directions = new int[][]{{1, 2}, {-1, 2}, {1, -2}, {-1, -2}, {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};
        for (int[] dir : directions) {
            if (x + dir[0] >= 0 && x + dir[0] < 8 && y + dir[1] >= 0 && y + dir[1] < 8) {
                if (a[x + dir[0]][y + dir[1]].getFigur() == null || a[x + dir[0]][y + dir[1]].getFigur().getFarbe() != this.getFarbe()) {
                    mFelder.add(a[x + dir[0]][y + dir[1]]);
                }
            }
        }
        return mFelder;
    }
}
