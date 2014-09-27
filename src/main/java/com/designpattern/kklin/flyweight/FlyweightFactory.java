package com.designpattern.kklin.flyweight;

import java.util.Map;
import java.util.HashMap;

/**
 * 是一个享元工厂，用来创建并管理Flyweight对象。它主要是用来确保合理地共享Flyweight,当用户请求一个Flyweight时，
 * FlyweightFactory对象提供一个已创建的实例或者创建一个（如果不存在的话）
 * @author kai
 *
 */
public class FlyweightFactory {

	private Map<String,Flyweight> flyweights = new HashMap<String,Flyweight>();
	
	public FlyweightFactory() {
		flyweights.put("X",new ConcreteFlyweight());
		flyweights.put("Y",new ConcreteFlyweight());
		flyweights.put("Z",new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key) {
		return ((Flyweight)flyweights.get(key));
	}
}
