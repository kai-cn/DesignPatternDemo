package com.designpattern.kklin.iterator;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate a = new ConcreteAggregate();
		
		
		for(int i=1 ;i<=10; i++) {
			a.add(i);
		}
		
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		
		while(!i.isDone()) {
			System.out.println(i.currentItem()+"--");
			i.next();
		}
		
		
	}

}
