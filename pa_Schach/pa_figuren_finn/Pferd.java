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
            int t_x = x + dir[0];
            int t_y = y + dir[1];
            if (t_x >= 0 && t_x < 8 && t_y >= 0 && t_y < 8) {
                if (a[t_x][t_y].getFigur() == null || a[t_x][t_y].getFigur().getFarbe() != this.getFarbe()) {
                    mFelder.add(a[t_x][t_y]);
                }
            }
        }
        return mFelder;
    }
}
