package pa_Schach;

import pa_Schach.pa_figuren_leon.*;
import pa_Schach.pa_figuren_leon.Schachfigur;

public class Board {

    private Feld[][] schachAr;
          //????

    //Konstruktor
    public Board() {
        schachAr = new Feld[8][8];
        for (int i = 0; i < schachAr.length; i++) {
            for (int j = 0; j < schachAr.length; j++) {
                Feld feld = new Feld(i, j);
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
        System.out.println("#  #  #  #  #  #  #  #  #  #");
        for (int y = schachAr.length - 1; y >= 0; y--) {
            System.out.print("#");
            for (int x = 0; x < schachAr.length; x++) {
                if (schachAr[x][y].getFigur() != null)
                    if (schachAr[x][y].getFigur().getFarbe() > 0) {
                        System.out.print("  " + schachAr[x][y].getFigur().getTyp());
                    } else {
                        System.out.print(" " + (-schachAr[x][y].getFigur().getTyp()));

                    }
                else
                    System.out.print("  .");
            }
            System.out.println("  #");

        }
        System.out.println("#  #  #  #  #  #  #  #  #  #");

    }

    public void start() {

        for (int i = 0; i < schachAr.length; i++) {
            Schachfigur bauer = new Bauer(1);
            setFigur(i, 1, bauer);
            //schachAr[i][1].setFigur(bauer);
        }

        for (int i = 0; i < schachAr.length; i++) {
            Schachfigur bauer = new Bauer(-1);
            setFigur(i, 6, bauer);
            //schachAr[i][6].setFigur(bauer);
        }

        int yWeiß = 0;

        for (int x = 1; x < schachAr.length; x += 5) {
            Schachfigur pferd = new Pferd(1);
            setFigur(x, yWeiß, pferd);
            //schachAr[x][yWeiß].setFigur(pferd);
        }

        for (int x = 2; x < schachAr.length; x += 3) {
            Schachfigur laeufer = new Laeufer(1);
            setFigur(x, yWeiß, laeufer);
            //schachAr[x][yWeiß].setFigur(laeufer);
        }

        for (int x = 0; x < schachAr.length; x += 7) {
            Schachfigur turm = new Turm(1);
            setFigur(x, yWeiß, turm);
            //schachAr[x][yWeiß].setFigur(turm);
        }


        Schachfigur koenigW = new Koenig(1);
        setFigur(4, yWeiß, koenigW);
        //schachAr[4][yWeiß].setFigur(koenigW);


        Schachfigur koeniginW = new Koenigin(1);
        setFigur(3, yWeiß, koeniginW);
        //schachAr[3][yWeiß].setFigur(koeniginW);

        int ySchwarz = 7;

        for (int x = 1; x < schachAr.length; x += 5) {
            Schachfigur pferd = new Pferd(-1);
            setFigur(x, ySchwarz, pferd);
            //schachAr[x][ySchwarz].setFigur(pferd);
        }

        for (int x = 2; x < schachAr.length; x += 3) {
            Schachfigur laeufer = new Laeufer(-1);
            setFigur(x, ySchwarz, laeufer);
            //schachAr[x][ySchwarz].setFigur(laeufer);
        }

        for (int x = 0; x < schachAr.length; x += 7) {
            Schachfigur turm = new Turm(-1);
            setFigur(x, ySchwarz, turm);
            //schachAr[x][ySchwarz].setFigur(turm);
        }


        Schachfigur koenigS = new Koenig(-1);
        setFigur(4, ySchwarz, koenigS);
        //schachAr[4][ySchwarz].setFigur(koenigS);


        Schachfigur koeniginS = new Koenigin(-1);
        setFigur(3, ySchwarz, koeniginS);
        //schachAr[3][ySchwarz].setFigur(koeniginS);

    }

    public void setFigur(int x, int y, Schachfigur figur) {
        schachAr[x][y].setFigur(figur);
        schachAr[x][y].getFigur().setFeld(schachAr[x][y]);
    }

    public void removeFigur(int x, int y) {
        schachAr[x][y].setFigur(null);
    }

    public void moveFigur(int x1, int y1, int x2, int y2) {
        this.setFigur(x2, y2, schachAr[x1][y1].getFigur());
        this.removeFigur(x1, y1);
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.start();
        b.print();
    }


}
