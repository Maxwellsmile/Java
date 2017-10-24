package com.hxj.extend1;
/**
 * The type Animal must be an abstract class to define abstract methods
 * 抽象类：
 *   abstract修饰
 *   可以有抽象方法
 *   也可以有非抽象方法
 *   抽象方法没有方法体，不对方法做具体实现
 * @author hxj
 *
 */
public abstract class Animal {

	String nickName;//昵称
	String color;//颜色
	String brand;//品种
	
	public void breath() {
		System.out.println(nickName+"会呼吸");
	}
	
	public void run() {
		System.out.println(nickName+"会跑");
	}
	
	//该方法无法描述清楚，由子类去具体实现
    public abstract void eat();
	
}
