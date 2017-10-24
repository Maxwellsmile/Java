package com.hxj.demo03;

public class Student {

	static String str = "静态成员变量";
	String str1 = "非静态成员变量";
	
	static {
		System.out.println(str);
		System.out.println("静态块");
	}
	
	{
		System.out.println(str1);
		System.out.println("构造块");
	}
	
	Student(){
		System.out.println("构造方法");
	}
	
}
