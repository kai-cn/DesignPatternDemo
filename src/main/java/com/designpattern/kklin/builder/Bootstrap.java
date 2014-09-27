package com.designpattern.kklin.builder;

/*
 * 客户端代码，客户不需知道具体的建造过程。
 */
public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
	}
}
