package com.designpattern.kklin.memento;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o = new Originator();
		o.setState("On");
		o.show();
		
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		o.setState("Off");
		o.show();
		
		o.setMemento(c.getMemento());
		o.show();
	}

}
