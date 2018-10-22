package pa_Schach;

import java.util.ArrayList;

public class Pferd extends Schachfigur{

    public Pferd(int farbe){
        super(3, farbe);
    }


    @Override
    public ArrayList<Feld> möglicheFelder(Feld[][] a) {
        ArrayList<Feld> mFelder = new ArrayList<Feld>();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
            }
        }
        return null;
    }
}