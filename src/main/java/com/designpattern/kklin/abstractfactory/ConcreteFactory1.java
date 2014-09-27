package com.designpattern.kklin.abstractfactory;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
