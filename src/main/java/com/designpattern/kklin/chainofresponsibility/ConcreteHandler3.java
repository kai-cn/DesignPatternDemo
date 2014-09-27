package com.designpattern.kklin.chainofresponsibility;

public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request >= 20 && request < 30) {
			System.out.println("ConcreteHandler3 处理请求"+request);
		}
		else {
			if(successor != null) {
				successor.handleRequest(request);
			}
		}
	}
}
