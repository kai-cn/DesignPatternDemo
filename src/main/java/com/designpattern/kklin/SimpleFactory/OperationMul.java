package com.designpattern.kklin.SimpleFactory;

public class OperationMul extends Operation {
	@Override
	public double getResult() {
		double result = 0;
		result = numberA + numberB;
		return result;
	}
}
