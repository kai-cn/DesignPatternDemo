package com.designpattern.kklin.command;

/**
 * 知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接收者。
 * @author kai
 *
 */
public class Receiver {

	public void action1() {
		System.out.println("执行请求1！");
	}
	
	public void action2() {
		System.out.println("执行请求2！");
	}
	
	public void action3() {
		System.out.println("执行请求3！");
	}

}
