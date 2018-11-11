package pa_Neuronalenetze;

public class Layer {

    private Neuron[] neurons;

    public Neuron[] getNeurons() {
        return neurons;
    }

    public void setNeurons(Neuron[] neurons) {
        this.neurons = neurons;
    }

    public Layer(int a, Layer lastL){
        neurons = new Neuron[a];
        for(int i = 0; i < neurons.length; i++){
            neurons[i] = new Neuron(lastL.neurons);
        }
    }

    public Layer(int a){
        neurons = new Neuron[a];
        for(int i = 0; i < neurons.length; i++){
            neurons[i] = new Neuron();
        }
    }

    public void feedN(){
        for (Neuron n:neurons) {
            n.feed();
        }
    }

    public void backN(){
        for (Neuron n:neurons){
            n.feedError();
        }
    }

}
