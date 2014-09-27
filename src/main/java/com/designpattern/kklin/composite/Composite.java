package com.designpattern.kklin.composite;

import java.util.List;
import java.util.ArrayList;

/**
 * 定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关的操作，比如
 * 增加add和删除remove
 * @author kai
 *
 */
public class Composite extends Component {
	
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(depth+"  "+name);
		
		for(Component component : children) {
			component.display(depth+2);
		}
	}

}
