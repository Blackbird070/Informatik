package pa_codierung;

public class Complex_KeyCode extends Codierer{

    private int[] key;

    public Complex_KeyCode(int[] key) {
        this.key = key;
    }

    public short[] encode(short[] ar) {
        short[] finish = new short[ar.length];
        for (int i = 0; i < ar.length; i++) {
            finish[i] = (short) ((ar[i] + key[i % key.length]) % 27);
        }
        return finish;
    }

    public short[] decode(short[] ar) {
        short[] finish = new short[ar.length];
        for (int i = 0; i < ar.length; i++) {
            finish[i] = (short) ((ar[i] + (27-key[i % key.length])) % 27);
        }
        return finish;
    }



}
