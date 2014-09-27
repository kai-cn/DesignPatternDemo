package com.designpattern.kklin.command;

public class Bootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver r = new Receiver();
		Command c1 = new ConcreteCommand1(r);
		Command c2 = new ConcreteCommand2(r);
		Command c3 = new ConcreteCommand3(r);
		Invoker i = new Invoker();
		i.setCommand(c1);
		i.setCommand(c2);
		i.setCommand(c3);
		i.executeCommand();
	}

}
