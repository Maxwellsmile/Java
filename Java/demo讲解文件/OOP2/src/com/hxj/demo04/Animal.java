package com.hxj.demo04;

public class Animal {

	static String str = "���ྲ̬��Ա����";
	String str1 = "����Ǿ�̬��Ա����";
	
	static {
		System.out.println(str);
		System.out.println("���ྲ̬��");
	}
	
	{
		System.out.println(str1);
		System.out.println("���๹���");
	}
	
	Animal(){
		System.out.println("���๹�췽��");
	}
	
}
