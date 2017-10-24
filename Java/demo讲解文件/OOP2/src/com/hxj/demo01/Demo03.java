package com.hxj.demo01;

public class Demo03 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "jack";
		s.age = 20;
		s.intro();
		
		test1(s);
		
		s.intro();
		
	}
	
	public static void test1(Student stu) {//param相当于test1方法的局部变量
		stu.name = "李四";
		stu.age = 34;
	}
	
}
