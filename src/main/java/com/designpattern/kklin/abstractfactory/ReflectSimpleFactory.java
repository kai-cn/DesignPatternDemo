package com.designpattern.kklin.abstractfactory;



public class ReflectSimpleFactory {

	public static AbstractProductA createProductA() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		
		AbstractProductA productA = null;
		
		Class productAClass = Class.forName("com.designpattern.kklin.abstractfactory.ProductA1");
		
		productA =  (AbstractProductA)productAClass.newInstance();
	
		
		return productA;
	}
	
	public static AbstractProductB createProductB() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		AbstractProductB productB = null;
		
		Class productAClass = Class.forName("com.designpattern.kklin.abstractfactory.ProductB1");
		
		productB =  (AbstractProductB)productAClass.newInstance();
	
		
		return productB;

	}
}
