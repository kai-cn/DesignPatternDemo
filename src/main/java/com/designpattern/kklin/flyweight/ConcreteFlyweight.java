package com.designpattern.kklin.flyweight;

/**
 * 继承Flyweight超类或实现Flyweight接口，并为内部状态增加存储空间
 * @author kai
 *
 */
public class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("具体Flyweight:"+extrinsicstate);
	}
}
