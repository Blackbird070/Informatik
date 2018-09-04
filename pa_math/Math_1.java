package pa_math;

public class Math_1 {


    public static long faktorial(int i) {


        long a = 1;

        for (int k = 1; k <= i; k++) {
            a *= k;


        }

        return a;


    }

    public static void main(String[] arg) {

    }



    public static boolean Primzahl(int x, int y){
        int a = x % y;
        if(a == 0){
            return false;
        }else if(y > Math.sqrt(x)) {
            return true;
        }else{
            return Primzahl(x,y+1);
        }
    }

}
