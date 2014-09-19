package com.designpattern.kklin.prototype;

public class ConcretePrototypeA extends Prototype {

	public ConcretePrototypeA(String id) {
		super(id);
	}
	
	@Override
	public Prototype cloneType() {
		
		Prototype type = null;
		
		try {
			type = (Prototype)this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return type;
		
		
	}
}
