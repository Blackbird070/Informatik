package Game;

public class Oberfläche {

    private int[][] area;

    public Oberfläche(int x, int y) {
        this.area = new int[x][y];
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                area[0][j] = new Wand().getTyp();
                area[area.length - 1][j] = new Wand().getTyp();
                area[i][0] = new Wand().getTyp();
                area[i][area[0].length - 1] = new Wand().getTyp();
            }
        }
    }

    public void print() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                int a = area[i][j];
                if (a == 1) {
                    System.out.println("x");
                } else if (a == 2) {
                    System.out.println("O");
                } else {
                    System.out.println(".");
                }
            }
        }
        System.out.println(area[4][4]);


    }

    public int[][] getArea() {
        return area;
    }

    public void setArea(int[][] area) {
        this.area = area;
    }

    public static void main(String[] arg) {
        Oberfläche o = new Oberfläche(5, 7);
        o.print();


    }
}
