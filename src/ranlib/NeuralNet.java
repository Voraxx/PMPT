package ranlib;

/**
 * NeuralNetwork
 * Version 1.0
 * 2023/06/03
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 * <p>
 */

public class NeuralNet {
    private int inputSize;
    private int hiddenSize;
    private int outputSize;
    private double[][] weights;

    public NeuralNet(int inputSize, int hiddenSize, int outputSize) {
        this.inputSize = inputSize;
        this.hiddenSize = hiddenSize;
        this.outputSize = outputSize;

        // Initialisiere die Gewichte mit zufälligen Werten
        weights = new double[inputSize + 1][hiddenSize];
        for (int i = 0; i <= inputSize; i++) {
            for (int j = 0; j < hiddenSize; j++) {
                weights[i][j] = Math.random();
            }
        }
    }

    public double[] feedForward(double[] input) {
        // Berechne die gewichtete Summe der Eingabeneuronen auf die versteckte Schicht
        double[] hiddenLayerOutput = new double[hiddenSize];
        for (int j = 0; j < hiddenSize; j++) {
            double sum = 0;
            for (int i = 0; i < inputSize; i++) {
                sum += input[i] * weights[i][j];
            }
            // Addiere den Schwellenwert (Bias)
            sum += weights[inputSize][j];
            hiddenLayerOutput[j] = sigmoid(sum);
        }

        // Berechne die gewichtete Summe der versteckten Schicht auf die Ausgabeneuronen
        double[] output = new double[outputSize];
        for (int k = 0; k < outputSize; k++) {
            double sum = 0;
            for (int j = 0; j < hiddenSize; j++) {
                sum += hiddenLayerOutput[j] * weights[j][k];
            }
            output[k] = sigmoid(sum);
        }

        return output;
    }

    private double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }
}
