package com.designpattern.kklin.prototype;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcretePrototypeA p1 = new ConcretePrototypeA("I");
		ConcretePrototypeA c1 = (ConcretePrototypeA)p1.cloneType();
		System.out.println("Cloned: "+c1.getId());
	}
}
