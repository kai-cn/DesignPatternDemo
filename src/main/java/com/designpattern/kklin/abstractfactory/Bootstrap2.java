package com.designpattern.kklin.abstractfactory;

public class Bootstrap2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractProductA productA = SimpleFactory.createProductA();
		
		AbstractProductB productB = SimpleFactory.createProductB();
	}

}
