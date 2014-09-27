package com.designpattern.kklin.templatemethod;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass c;
		
		c = new ConcreteClassA();
		c.templateMethod();
		
		c = new ConcreteClassB();
		c.templateMethod();
	}
}
