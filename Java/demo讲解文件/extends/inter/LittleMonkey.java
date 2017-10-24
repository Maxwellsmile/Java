package com.hxj.inter;

/**
 * java中是单继承
 * java中可以通过实现接口拥有接口中的方法
 * 实现接口弥补了单继承
 * @author hxj
 *
 */
public class LittleMonkey extends OldMonkey implements SwimAble{

	@Override
	public void swim() {
		System.out.println("小猴子跟着鱼老师学会了游泳");
	}
	
}
