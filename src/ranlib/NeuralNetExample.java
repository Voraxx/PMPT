package ranlib;
import java.util.Arrays;

public class NeuralNetExample {
    public static void main(String[] args) {
        int inputSize = 2;
        int hiddenSize = 3;
        int outputSize = 1;

        NeuralNet neuralNetwork = new NeuralNet(inputSize, hiddenSize, outputSize);

        double[] input = {0.5, 0.8};
        double[] output = neuralNetwork.feedForward(input);

        System.out.println("Output: " + Arrays.toString(output));
    }
}
