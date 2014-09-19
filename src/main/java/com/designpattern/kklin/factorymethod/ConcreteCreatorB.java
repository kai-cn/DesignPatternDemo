package com.designpattern.kklin.factorymethod;

public class ConcreteCreatorB extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}
