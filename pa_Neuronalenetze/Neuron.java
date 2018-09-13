package pa_Neuronalenetze;

public class Neuron {

    private Connection[] arConnection;
    private double output;

    public Neuron(Neuron[] arNeuron){
        arConnection = new Connection[arNeuron.length];
        for(int i = 0; i < arConnection.length; i++){
            arConnection[i] = new Connection(arNeuron[i], Math.random()*2-1);
        }
    }

    public Neuron(){
    }

    public void calculate(){
        double x = 0;
        for(int i = 0; i < arConnection.length; i++) {
            x = arConnection[i].getW() * arConnection[i].getNeuron().output;
        }
        output = 1/(1 + Math.exp(-x));
    }

}
