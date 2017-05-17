import java.util.List;

/**
 * Created by DOMurzin on 5/10/2017.
 */
public class Neuron {

    private double bias;

    private List<Double> weights;

    /**
     * Assumption: neuron can't exist without function
     */
    private ActivationFunction function = new SigmoidFunction();

    public Neuron(double bias, List<Double> weights) {
        this.bias = bias;
        this.weights = weights;
    }

    public double getBias() {
        return bias;
    }

    public List<Double> getWeights() {
        return weights;
    }
}
