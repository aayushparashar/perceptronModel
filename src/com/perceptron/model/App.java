package com.perceptron.model;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] input = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
		float[] output = { 0, 0, 0, 1 };
		PerceptronModel pp = new PerceptronModel(input, output);
		pp.train(0.1f);
		System.out.println(pp.calculateOutput(new float[]{0,0}));
		System.out.println(pp.calculateOutput(new float[]{0,1}));
		System.out.println(pp.calculateOutput(new float[]{1,0}));
		System.out.println(pp.calculateOutput(new float[]{1,1}));

	}

}
