package pa_Neuronalenetze;

public class Connection {

    private double w;
    private Neuron neuron;

    public Connection(Neuron neuron, double w){
        this.neuron = neuron;
        this.w = w;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public Neuron getNeuron() {
        return neuron;
    }

    public void setNeuron(Neuron neuron) {
        this.neuron = neuron;
    }
}
