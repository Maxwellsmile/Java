package com.hxj.demo04;

public class Cat extends Animal{

	static String str = "子类静态成员变量";
	String str1 = "子类非静态成员变量";
	
	static {
		System.out.println(str);
		System.out.println("子类静态块");
	}
	
	{
		System.out.println(str1);
		System.out.println("子类构造块");
	}
	
	Cat(){
		System.out.println("子类构造方法");
	}
	
}
