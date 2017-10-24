package com.hxj.demo04;

public class Animal {

	static String str = "父类静态成员变量";
	String str1 = "父类非静态成员变量";
	
	static {
		System.out.println(str);
		System.out.println("父类静态块");
	}
	
	{
		System.out.println(str1);
		System.out.println("父类构造块");
	}
	
	Animal(){
		System.out.println("父类构造方法");
	}
	
}
