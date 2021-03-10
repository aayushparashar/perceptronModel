package com.perceptron.model;

public class PerceptronModel {
	private float[][] input;
	private float[] weights;
	private float[] output;
	private int numOfWeights;

	public PerceptronModel(float[][] input, float[] output) {
		super();
		this.input = input;
		this.output = output;
		this.numOfWeights = input[0].length;
		this.weights = new float[numOfWeights];
		intializeWeights();
	}

	private void intializeWeights() {
		for (int i = 0; i < weights.length; i++)
			weights[i] = 0;
	}

	public void train(float learningRate) {
		float totalError = 1;
		while (totalError != 0) {
			totalError = 0;
			for (int i = 0; i < output.length; i++) {

				float calculatedOutput = calculateOutput(input[i]);
				float error = Math.abs(calculatedOutput - output[i]);
				totalError += error;
				for (int j = 0; j < weights.length; j++) {
					weights[j] = weights[j] + error * input[i][j] * learningRate;
				}
			}
			System.out.println("Keep learning, current error: "+totalError);
		}
	}

	public float calculateOutput(float[] fs) {
		float sum = 0f;
		for(int i=0; i<fs.length; i++)
			sum+= fs[i]*weights[i];
		return ActivationFunction.stepFunction(sum);
	}

}
