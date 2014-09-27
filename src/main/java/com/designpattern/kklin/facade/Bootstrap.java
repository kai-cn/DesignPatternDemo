package com.designpattern.kklin.facade;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade();
		
		facade.methodA();
		facade.methodB();
	}

}
