package com.hxj.studentmanage;

import com.hxj.demo1.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		Student[] students = new Student[2];
		//初始化
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(16);
		students[0] = s1;
		Student s2 = new Student();
		s2.setName("李四");
		s2.setAge(17);
		students[1] = s2;
		
		//添加
		//.....add....
		//修改
		//删除
		//添加
		//.....add....
	}
	
}
