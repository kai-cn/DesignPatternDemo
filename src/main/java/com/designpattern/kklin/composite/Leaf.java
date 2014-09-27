package com.designpattern.kklin.composite;
/**
 * 表示叶节点对象，叶节点没有子节点。
 * @author kai
 *
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove from a leaf");
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(depth+"  "+name);
	}

	

}
