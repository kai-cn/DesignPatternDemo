package com.designpattern.kklin.abstractfactory;

public class SimpleFactory {

	private static char factory = '1';
	
	public static AbstractProductA createProductA() {
		AbstractProductA productA = null;
		
		switch(factory) {
		case '1':
			productA = new ProductA1();
			break;
		case '2':
			productA = new ProductA2();
			break;
		}
		
		return productA;
	}
	
	public static AbstractProductB createProductB() {
		AbstractProductB productB = null;
		
		switch(factory) {
		case '1':
			productB = new ProductB1();
			break;
		case '2':
			productB = new ProductB2();
			break;
		}
		
		return productB;
	}
}
