package com.perceptron.model;

public class ActivationFunction {
	public static int stepFunction(float x) {
		return x >= 1 ? 1 : 0;
	}

}
