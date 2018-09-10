package pa_Schach.ai;

import pa_Schach.Board;

public class Evaluator {

    private final int serienNr;
    private static int next_nr;


    public Evaluator(){
        next_nr ++;
        serienNr = next_nr;
    }

    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.println(new Evaluator());
        }
    }

    @Override
    public String toString() {
        return "Evaluator{" +
                "serienNr=" + serienNr +
                '}';
    }

    public int evaluate(Board b){
        return 0;
    }


}
