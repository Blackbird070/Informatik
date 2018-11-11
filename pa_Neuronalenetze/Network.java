package pa_Neuronalenetze;

import java.util.Arrays;

public class Network {

    private Layer[] layers;

    public Network(int... i){
        layers = new Layer[i.length];
        layers[0] = new Layer(i[0]);
        for(int j = 1; j < i.length; j++){
            layers[j] = new Layer(i[j], layers[j-1]);
        }
    }

    public double[] calculate(double... inputs){
        for(int i = 0; i < inputs.length; i++){
            layers[0].getNeurons()[i].setOutput(inputs[i]);
        }
        for(int i = 1; i < layers.length; i++){
            layers[i].feedN();
        }
        double[] output = new double[layers[layers.length-1].getNeurons().length];

        for(int i = 0; i < layers[layers.length - 1].getNeurons().length; i++){
            output[i] += layers[layers.length - 1].getNeurons()[i].getOutput();
        }


        return output;


    }

    public static void main(String... arg){
        Network n = new Network(1,2,3);
        System.out.println(Arrays.toString(n.calculate(5.5)));

    }
}
