package com.designpattern.kklin.factorymethod;

public class ConcreteCreatorA extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}
