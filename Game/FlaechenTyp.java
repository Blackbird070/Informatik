package Game;

public abstract class FlaechenTyp {

    private boolean invicible;
    private int typ;

    public FlaechenTyp(int typ, boolean invicible){

    }

    public boolean isInvicible() {
        return invicible;
    }

    public void setInvicible(boolean invicible) {
        this.invicible = invicible;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }
}
