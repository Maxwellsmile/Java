package com.hxj.buchong;
/**
 * 继承的内容不包括构造方法
 * @author hxj
 *
 */
public class Cat extends Animal{

	public Cat() {
		super();//super表示父类的引用,默认存在于构造方法的第一句
		System.out.println("Cat的空构造");
	}
	
	@Override
	public void setNickName(String nickName) {
		super.setNickName(nickName);
	}
	
}
