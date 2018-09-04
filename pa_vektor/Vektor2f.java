package pa_vektor;

public class Vektor2f {
    protected float x;
    protected float y;

    //Konstruktor
    public Vektor2f(float x, float y) {
        setX(x);
        setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float laenge() {
        float l = (float) Math.sqrt(this.x * this.x + this.y * this.y);
        return l;
    }

    public float pNorm(float n) {
        float b = (float) Math.pow(
                Math.pow(this.x, n) + Math.pow(this.y, n), 1 / n);
        return b;
    }

    public void skale(float s){
        this.x *= s;
        this.y *= s;
    }

    public void normiere(){
        skale((1/laenge()));
    }

    @Override
    public String toString() {
        return "Vektor2f{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



    public static void main(String[] arg) {
    }
}
