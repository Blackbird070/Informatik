package pa_codierung;

public class KeyCode extends Codierer{

    private int key;

    public KeyCode(int key) {
        this.key = key;
    }

    @Override
    public short[] encode(short[] ar) {
        short[] finish = new short[ar.length];
        for (int i = 0; i < ar.length; i++) {
            finish[i] = (short) ((ar[i] + key) % 27);
        }
        return finish;
    }

    @Override
    public short[] decode(short[] ar) {
        short[] finish = new short[ar.length];
        for (int i = 0; i < ar.length; i++) {
            finish[i] = (short) ((ar[i] + (27-key)) % 27);
        }
        return finish;
    }
}
