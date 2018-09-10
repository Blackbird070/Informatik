package pa_Schach.pa_figuren_finn;

import pa_Schach.Feld;
import pa_Schach.pa_figuren_leon.Schachfigur;

import java.util.ArrayList;

public class Bauer extends Schachfigur {


    public Bauer(int farbe) {
        super(1, farbe);
    }



    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {
        ArrayList<Feld> mFelder = new ArrayList();
        Feld f = this.getFeld();
        if(a[f.getX()][f.getY() + this.getFarbe()].getFigur() == null){
            mFelder.add(a[f.getX()][f.getY() + this.getFarbe()]);
            if(f.getY() == 1 && f.getFigur().getFarbe() == 1 || f.getY() == 6 && f.getFigur().getFarbe() == -1){
                if(a[f.getX()][f.getY() + this.getFarbe() * 2].getFigur() == null){
                    mFelder.add(a[f.getX()][f.getY() + this.getFarbe() * 2]);
                }
            }
        }
        if(f.getX() > 0 && a[f.getX() - 1][f.getY() + this.getFarbe()].getFigur() != null) {
            if(a[f.getX() - 1][f.getY() + this.getFarbe()].getFigur().getFarbe() != this.getFarbe()){
                mFelder.add( a[f.getX() - 1][f.getY() + this.getFarbe()]);
            }
        }
        if(f.getX() < 7 && a[f.getX() + 1][f.getY() + this.getFarbe()].getFigur() != null) {
            if(a[f.getX() + 1][f.getY() + this.getFarbe()].getFigur().getFarbe() != this.getFarbe()){
                mFelder.add( a[f.getX() + 1][f.getY() + this.getFarbe()]);
            }
        }
        return mFelder;
    }






}
