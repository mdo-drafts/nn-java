import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by DOMurzin on 5/17/2017.
 */
public class NeuralNetworkTest {


    @Test
    public void testNetworkSize() {
        NeuralNetwork nn = new NeuralNetwork(2, 3, 1);
        assertThat(nn.getLayers()).hasSize(2);
        assertThat(nn.getLayers().get(0)).hasSize(3);
        assertThat(nn.getLayers().get(1)).hasSize(1);
    }

    @Test
    public void testHiddenLayerSize() {
        NeuralNetwork nn = new NeuralNetwork(2, 3, 1);
        Neuron[] hiddenLayer = nn.getLayers().get(0);
        assertThat(hiddenLayer).hasSize(3);
        for (Neuron neuron : hiddenLayer) {
            assertThat(neuron.getWeights()).hasSize(2);
        }
    }

    @Test
    public void testOutputLayer() {
        NeuralNetwork nn = new NeuralNetwork(2, 3, 1);
        Neuron[] hiddenLayer = nn.getLayers().get(1);
        assertThat(hiddenLayer).hasSize(1);
        Neuron neuron = hiddenLayer[0];
        assertThat(neuron.getWeights()).hasSize(3);
    }
}