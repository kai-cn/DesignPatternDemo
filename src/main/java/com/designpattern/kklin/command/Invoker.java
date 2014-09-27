package com.designpattern.kklin.command;

import java.util.List;
import java.util.ArrayList;

/**
 * 要求该命令执行这个请求
 * @author kai
 *
 */
public class Invoker {
	private List<Command> commands = new ArrayList<Command>();
	
	public void setCommand(Command command) {
		
		if(command instanceof ConcreteCommand3) {
			System.out.println("Can't execute ConcreteCommand3");
		}
		else {
			commands.add(command);
		}

	}
	
	public void executeCommand() {
		
		for(Command command : commands) {
			command.execute();
		}
	}
}
