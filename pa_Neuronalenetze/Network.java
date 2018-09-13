package pa_Neuronalenetze;

public class Network {

    private Layer[] arLayer;

    public Network(int... a){
        arLayer = new Layer[a.length];
        arLayer[0] = new Layer(a[0]);
        for(int i = 1; i < a.length; i++){
            arLayer[i] = new Layer(a[i], arLayer[i-1]);
        }
    }


}
