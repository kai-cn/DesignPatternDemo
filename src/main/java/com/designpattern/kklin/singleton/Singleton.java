package com.designpattern.kklin.singleton;

/**
 * 定义一个getInstance操作，运行客户访问它的唯一实例。getInstance是一个静态方法，
 * 主要负责创建自己的唯一实例。
 * @author kai
 *
 */
public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
		
	}
}
