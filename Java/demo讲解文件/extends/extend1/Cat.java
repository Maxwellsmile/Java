package com.hxj.extend1;
/**
The type Cat must implement(ʵ��) the inherited(�̳�) abstract method Animal.eat()
 * ����Ϊ�����ࣺ
 *    ���������д����ĳ��󷽷������Ǹ����ǳ�����
 * @author hxj
 *
 */
public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println(nickName+"�����");
	}
	
}
