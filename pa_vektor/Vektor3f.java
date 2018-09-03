package pa_vektor;

import pa_vektor.Vektor2f;

public class Vektor3f extends Vektor2f {
    float z;

    //Konstruktor
    public Vektor3f(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    @Override
    public float laenge() {
        float l = (float) Math.sqrt(this.x * this.x + this.y * this.y + this.z*this.z);
        return l;
    }

    public float pNorm(float n) {
        float b = (float) Math.pow(
                Math.pow(this.x, n) + Math.pow(this.y, n) + Math.pow(this.z, n), 1 / n);
        return b;
    }

    public void skale(float s){
        this.x *= s;
        this.y *= s;
        this.z *= s;
    }

    @Override
    public String toString() {
        return "Vektor3f{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
