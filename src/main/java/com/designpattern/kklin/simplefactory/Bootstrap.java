package com.designpattern.kklin.simplefactory;

public class Bootstrap {
	
	public static void main(String[] args)
	{
		Operation oper;
		oper = OperationFactory.createOperate('+');
		oper.setNumberA(1);
		oper.setNumberB(2);
		double result = oper.getResult();
	}

}
