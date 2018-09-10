package pa_Schach.ai;

import pa_Schach.Board;
import pa_Schach.Feld;

import java.util.ArrayList;

public class Minimax {

    private Evaluator evaluator;

    public Minimax(Evaluator evaluator) {
        this.evaluator = evaluator;
    }

    public ArrayList<Feld[]> allMoves(Board b, int player){
        ArrayList<Feld[]> felder = new ArrayList<>();
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                if(b.getSchachAr()[x][y].getFigur() != null && b.getSchachAr()[x][y].getFigur().getFarbe() == player){
                    for (Feld feld:b.getSchachAr()[x][y].getFigur().möglicheFelder(b.getSchachAr())){
                        felder.add(new Feld[]{b.getSchachAr()[x][y], feld});
                    }
                }
            }
        }
        return felder;
    }

    public Feld[] bestMove(int player){
        return null;
    }

}
