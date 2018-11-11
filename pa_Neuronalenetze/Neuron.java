package pa_Neuronalenetze;

import java.util.zip.CheckedOutputStream;

public class Neuron {

    private double output;
    private double output_error;
    private double output_der;
    private Connection[] connections;

    public Neuron(Neuron[] lastN){
        connections = new Connection[lastN.length];
        for(int i = 0; i < lastN.length; i++){
            connections[i] = new Connection(lastN[i], this, 0.5);
        }

    }
    public Neuron(){
    }

    public double sigmoid(double input){
        return 1 / (1 + Math.exp(-input));
    }

    public double sigmoidPrime(double input){
        return sigmoid(input) * (1 - sigmoid(input));
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
        output_der = sigmoidPrime(f);
        output = sigmoid(f);
    }

    public void feedError(){
        for(Connection c: connections){
            c.getStartN().setOutput_error((c.getStartN().getOutput_error() + output_error) * c.getWeight() * c.getStartN().getOutput_der() );
        }

    }






    public double getOutput_error() {
        return output_error;
    }

    public void setOutput_error(double output_error) {
        this.output_error = output_error;
    }

    public double getOutput_der() {
        return output_der;
    }

    public void setOutput_der(double output_der) {
        this.output_der = output_der;
    }

    public Connection[] getConnections() {
        return connections;
    }

    public void setConnections(Connection[] connections) {
        this.connections = connections;
    }
}
