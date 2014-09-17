package com.designpattern.kklin.Decorator;

class ConcreteComponent extends Component {
  
  @Override
  public void Operation() {
    System.out.println("具体对象的操作");
  }
}