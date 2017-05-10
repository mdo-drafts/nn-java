import java.util.List;

/**
 * Created by DOMurzin on 5/10/2017.
 */
public class Neuron {

    private Double bias;

    private List<Double> weights;

    public Neuron(Double bias, List<Double> weights) {
        this.bias = bias;
        this.weights = weights;
    }
}
