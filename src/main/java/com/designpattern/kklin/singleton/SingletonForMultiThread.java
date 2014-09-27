package com.designpattern.kklin.singleton;

import java.util.concurrent.locks.Lock; 
import java.util.concurrent.locks.ReentrantLock; 

public class SingletonForMultiThread {

	private static SingletonForMultiThread instance;
	private static Lock lock = new ReentrantLock();
	
	private SingletonForMultiThread() {
		
	}
	
	public static SingletonForMultiThread getInstance() {
		
		if(instance == null) {
			lock.lock();
			
			if(instance == null) {
				instance = new SingletonForMultiThread();
			}
			
			lock.unlock();

		}
		
		return instance;
		
	}
}
