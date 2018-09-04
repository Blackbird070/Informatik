package pa_Schneckenrennen;

public class Rennschnecke {
    private String name;
    private int vMax;
    private int way;
    private int place;

    //Konstruktor
    public Rennschnecke(String name) {
        this.name = name;
        this.vMax = ((int)(Math.random()*5))+6;
        this.way = 0;
    }

    public void update(){
        this.way += (int)(Math.random()*this.vMax+1);
    }

    public String getName() {
        return name;
    }

    public int getvMax() {
        return vMax;
    }

    public int getWay() {
        return way;
    }

    public int getPlace(){
        return place;
    }

    public void setPlace(int place){
        this.place = place;
    }

    @Override
    public String toString() {
        return "\n Rennschnecke{" +
                "\n   name='" + name + '\'' +
                "\n   vMax=" + vMax +
                "\n   way=" + way;
    }
}
