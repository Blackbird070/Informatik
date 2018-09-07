package pa_Schach;

public class Board {

    private Feld[][] schachAr;

    //Konstruktor
    public Board() {
        schachAr = new Feld[8][8];
        for(int i = 0; i < schachAr.length; i++){
            for(int j = 0; j < schachAr.length; j++){
                Feld feld = new Feld(i,j);
                schachAr[i][j] = feld;
            }
        }
    }

    public Feld[][] getSchachAr() {
        return schachAr;
    }

    public void setSchachAr(Feld[][] schachAr) {
        this.schachAr = schachAr;
    }

    public void print() {
        System.out.println("# # # # # # # # # #");
        for (int y = schachAr.length - 1; y >= 0; y--) {
            System.out.print("#");
            for (int x = 0; x < schachAr.length; x++) {
                if (schachAr[x][y].getFigur() != null)
                    if (schachAr[x][y].getFigur().getFarbe() > 0) {
                        System.out.print(" " + schachAr[x][y].getFigur().getTyp());
                    } else {
                        System.out.print("" + (-schachAr[x][y].getFigur().getTyp()));

                    }
                else
                    System.out.print(" .");
            }
            System.out.println(" #");

        }
        System.out.println("# # # # # # # # # #");

    }

    public void start() {

        for (int i = 0; i < schachAr.length; i++) {
            Schachfigur bauer = new Bauer(1);
            schachAr[i][1].setFigur(bauer);
        }


    }

    public void setFigur(int x, int y, Schachfigur figur){
        schachAr[x][y].setFigur(figur);
        schachAr[x][y].getFigur().setFeld(schachAr[x][y]);
    }

    public void removeFigur(int x, int y){
        schachAr[x][y].setFigur(null);
    }

    public void moveFigur(int x1, int y1, int x2, int y2){
        this.setFigur(x2, y2, schachAr[x1][y1].getFigur());
        this.removeFigur(x1, y1);
    }





    public static void main(String[] args) {
        Board b = new Board();
        b.start();
        b.print();
        b.moveFigur(1,1,2,2);
        b.print();

    }


}
