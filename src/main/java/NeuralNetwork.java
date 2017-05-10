import java.util.ArrayList;
import java.util.List;

/**
 * Created by DOMurzin on 5/10/2017.
 */
public class NeuralNetwork {

    private List<Neuron[]> layers;

    public NeuralNetwork(int... layersSizes) {
        for (int size : layersSizes) {
            Neuron[] layer = new Neuron[size];
            /*
            for (int i = 0; i < layer.length; i++) {
                layer[i] = new Neuron();
            }
            */
        }

//        initLayers();
    }

    public NeuralNetwork(List<Neuron[]> layers) {
        this.layers = layers;
    }

    public List<Double> forward(List<Double> inputs){
        List<Double> outputs = new ArrayList<Double>();

        return outputs;
    }

    public List<Double> backward(){
        return null;
    }
}
