package pa_Schach.pa_figuren_leon;

import pa_Schach.Feld;

import java.util.ArrayList;

public class Pferd extends Schachfigur{



    public Pferd(int farbe){
        super(3, farbe);
    }


    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {
        ArrayList<Feld> mFelder = new ArrayList<>();
        int x = this.getFeld().getX();
        int y = this.getFeld().getY();

        Feld mFeld1 = new Feld(x+1,y+2);
        Feld mFeld2 = new Feld(x+1,y-2);
        Feld mFeld3 = new Feld(x-1,y+2);
        Feld mFeld4 = new Feld(x-1,y-2);
        Feld mFeld5 = new Feld(x+2,y+1);
        Feld mFeld6 = new Feld(x+2,y-1);
        Feld mFeld7 = new Feld(x-2,y+1);
        Feld mFeld8 = new Feld(x-2,y-1);

        mFelder.add(mFeld1);
        mFelder.add(mFeld2);
        mFelder.add(mFeld3);
        mFelder.add(mFeld4);
        mFelder.add(mFeld5);
        mFelder.add(mFeld6);
        mFelder.add(mFeld7);
        mFelder.add(mFeld8);

        return mFelder;
    }
}
