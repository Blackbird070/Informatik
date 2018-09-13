package pa_Neuronalenetze;

public class Layer {

    private Neuron[] arNeurons;

    public Layer(int anN){
        arNeurons = new Neuron[anN];
        for(int i = 0; i < arNeurons.length; i++){
            arNeurons[i] = new Neuron();
        }
    }

    public Layer(int anN, Layer preL){
        arNeurons = new Neuron[anN];
        for(int i = 0; i < arNeurons.length; i++){
            arNeurons[i] = new Neuron(preL.arNeurons);
        }
    }

}
