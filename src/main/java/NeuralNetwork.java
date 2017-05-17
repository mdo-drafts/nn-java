import java.util.ArrayList;
import java.util.List;

/**
 * Created by DOMurzin on 5/10/2017.
 */
public class NeuralNetwork {

    private List<Neuron[]> layers;

    public NeuralNetwork(int... layersSizes) {
        layers = new ArrayList<Neuron[]>();
        int previousLevelSize = layersSizes[0];
        for (int i = 1; i < layersSizes.length; i++) {
            Neuron[] layer = new Neuron[layersSizes[i]];
            for (int p = 0; p < layer.length; p++) {
                List<Double> weights = new ArrayList<Double>();
                for (int j = 0; j < previousLevelSize; j++) {
                    double weight = Math.random();
                    weights.add(weight);
                }
                double bias = Math.random();
                Neuron neuron = new Neuron(bias, weights);
                layer[p] = neuron;
            }
            layers.add(layer);
            previousLevelSize = layer.length;
        }
    }

    public NeuralNetwork(List<Neuron[]> layers) {
        this.layers = layers;
    }

    public List<Double> forward(List<Double> inputs) {
        List<Double> outputs = new ArrayList<Double>();

        return outputs;
    }

    public List<Double> backward() {
        return null;
    }

    public List<Neuron[]> getLayers() {
        return layers;
    }
}
