package pa_Physik;

public class Feder extends PhysikObject{

    double A;
    double Ruhelage = 0;
    double frequenz;
    double xStart = 0.0;
    double vStart;
    int D;
    int m;


    //Konstruktor
    public Feder(int D, int m, double frequenz, double vStart, int A){ //D in N/m,  m in kg
        this.vStart = vStart;
        this.frequenz = frequenz;
        this.m = m;
        this.D = D;
        this.A = A;
    }



    public double fx(double t){
        double x = A * Math.cos(2 * pi * frequenz * t - Math.atan(vStart/(xStart * 2 * pi * frequenz)));
        xStart = x;
        return x;
    }

    public static void main(String[] arg){
        Feder feder1 = new Feder(100, 1, 50.0, 1.0, 10);
        for(double i = 0.0; i < 1000.0; i++){
            System.out.println(feder1.fx(i));
        }
    }


}
