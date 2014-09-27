package com.designpattern.kklin.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request >= 10 && request < 20) {
			System.out.println("ConcreteHandler2 处理请求"+request);
		}
		else {
			if(successor != null) {
				successor.handleRequest(request);
			}
		}
	}
}
