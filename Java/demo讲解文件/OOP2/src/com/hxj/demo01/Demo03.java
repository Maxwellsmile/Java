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
	
	public static void test1(Student stu) {//param�൱��test1�����ľֲ�����
		stu.name = "����";
		stu.age = 34;
	}
	
}
