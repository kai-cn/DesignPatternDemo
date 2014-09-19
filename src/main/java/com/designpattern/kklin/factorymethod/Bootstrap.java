package com.designpattern.kklin.factorymethod;

public class Bootstrap {

	public static void main(String args) {
		Creator creator = new ConcreteCreatorA();
		
		Product product = creator.factoryMethod();
		product.printPrice();
	}
}
