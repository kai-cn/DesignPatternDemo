package com.designpattern.kklin.bridge;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction ab = new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
	}

}
