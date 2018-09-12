package pa_threads;

public class Zaehler extends Thread {



    private int millis = (int) (200 * Math.random() + 800);

    public void run(){
        if(Math.random() > 0.5){
            run1();
        }else{
            run2();
        }
    }

    public void run1(){

    }

    public void run2(){

    }



    public static void main(String[] args){
        Zaehler z = new Zaehler();
        z.start();
        Zaehler z2 = new Zaehler();
        z2.start();
    }

}
