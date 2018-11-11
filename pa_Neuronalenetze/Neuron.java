package pa_Neuronalenetze;

public class Neuron {

    private double output;
    private Connection[] connections;

    public Neuron(Neuron[] lastN){
        connections = new Connection[lastN.length];
        for(int i = 0; i < lastN.length; i++){
            connections[i] = new Connection(lastN[i], this, 0.5);
        }

    }
    public Neuron(){
    }

    public void functionN(double input){
        output = 1 / (1 + Math.exp(-input));
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public void feed(){
        double f = 0;
        for (Connection c:connections) {
            f += c.partialInput();
        }
        functionN(f);
    }

}
