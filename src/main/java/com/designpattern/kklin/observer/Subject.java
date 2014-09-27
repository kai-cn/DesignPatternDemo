package com.designpattern.kklin.observer;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	//增加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	//移除观察者
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	//通知
	public void notifyObserver() {
		
		for(Observer o : observers) {
			o.update();
		}
	}

}
