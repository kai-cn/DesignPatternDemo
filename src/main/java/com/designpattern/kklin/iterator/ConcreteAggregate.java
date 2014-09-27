package com.designpattern.kklin.iterator;

import java.util.List;
import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIteractor() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	public int getCount() {
		return items.size();
	}
	
	public void add(Object item) {
		items.add(item);
	}

	public void remove(Object item) {
		items.remove(item);
	}
	
	public Object get(int index) {
		return items.get(index);
	}
}
