package com.designpattern.kklin.flyweight;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int extrinsicstate = 22;
		FlyweightFactory f = new FlyweightFactory();
		Flyweight fx = f.getFlyweight("X");
		fx.operation(--extrinsicstate);
		
		Flyweight fy = f.getFlyweight("Y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz = f.getFlyweight("Z");
		fz.operation(--extrinsicstate);
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		uf.operation(--extrinsicstate);
	}

}