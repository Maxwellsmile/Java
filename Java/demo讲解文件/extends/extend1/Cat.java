package com.hxj.extend1;
/**
The type Cat must implement(实现) the inherited(继承) abstract method Animal.eat()
 * 父类为抽象类：
 *    子类必须重写父类的抽象方法，除非该类是抽象类
 * @author hxj
 *
 */
public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println(nickName+"会吃鱼");
	}
	
}
