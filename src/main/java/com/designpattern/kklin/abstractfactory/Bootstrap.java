package com.designpattern.kklin.abstractfactory;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory factory = new ConcreteFactory1();
		//AbstractFactory factory = new ConcreteFactory2();
		factory.createProductA();
		factory.createProductB();
	}

}
