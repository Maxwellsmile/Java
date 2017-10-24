package com.hxj.demo01;

public class Demo02 {

	public static void main(String[] args) {
		//基本数据类型在传参过程本身不会受到影响
		int i = 20;  
		test1(i);
		System.out.println(i);
	}
	
	public static void test1(int param) {//param相当于test1方法的局部变量
		param+=20;
	}
	
}
