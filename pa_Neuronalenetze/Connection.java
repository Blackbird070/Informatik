package pa_Neuronalenetze;

public class Connection {

    private Neuron startN;
    private Neuron endN;
    private double weight;

    public Connection(Neuron startN, Neuron endN, double weight) {
        this.startN = startN;
        this.endN = endN;
        this.weight = weight;
    }

    public Neuron getStartN() {
        return startN;
    }

    public void setStartN(Neuron startN) {
        this.startN = startN;
    }

    public Neuron getEndN() {
        return endN;
    }

    public void setEndN(Neuron endN) {
        this.endN = endN;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double partialInput(){
        double d;
        d = startN.getOutput() * weight;
        return d;
    }
}
