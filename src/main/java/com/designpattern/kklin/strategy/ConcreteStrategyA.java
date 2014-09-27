package com.designpattern.kklin.strategy;

/*
 * 封装了具体的算法或行为，继承于Strategy
 */
public class ConcreteStrategyA extends Strategy {
	
	@Override
	public void algorithmInterface() {
		System.out.println("算法A实现");
	}

}
