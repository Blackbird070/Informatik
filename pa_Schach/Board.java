package pa_Schach;

public class Board {

    Feld[][] schachAr;

    //Konstruktor
    public Board() {
        schachAr = new Feld[8][8];
        for(int i = 0; i < schachAr.length; i++){
            for(int j = 0; j < schachAr.length; j++){
                Feld feld = new Feld(0);
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
        for (int y = 0; y < schachAr.length; y++) {
            System.out.print("#");
            for (int x = 0; x < schachAr.length; x++) {
                if (schachAr[x][y] != null)
                    if (schachAr[x][y].farbe > 0) {
                        System.out.print(" " + schachAr[x][y].figur.typ);
                    } else {
                        System.out.print("" + (-schachAr[x][y].figur.typ));

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
            schachAr[i][0].setFigur(bauer);
        }


    }


    public static void main(String[] args) {
        Board b = new Board();
        b.start();
        b.print();

    }


}
