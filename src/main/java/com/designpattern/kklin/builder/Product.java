package com.designpattern.kklin.builder;

import java.util.List;
import java.util.ArrayList;

/*
 * 产品类，由多个部件组成。
 */
public class Product {

	List<String> parts = new ArrayList<String>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("\n产品 创建----");
		
		for(String part : parts) {
			System.out.println(part);
		}
	}
}
