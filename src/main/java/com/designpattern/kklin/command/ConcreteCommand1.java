package com.designpattern.kklin.command;

/**
 * 将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现execute
 * @author kai
 *
 */
public class ConcreteCommand1 extends Command {

	public ConcreteCommand1(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action1();
	}
}
