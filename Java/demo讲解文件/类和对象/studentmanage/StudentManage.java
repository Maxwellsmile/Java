package com.hxj.studentmanage;

import com.hxj.demo1.Student;

/**
 * 学生管理类：
 *    归纳学生信息(使用的容器数组) 
 * @author hxj
 *
 */
public class StudentManage {

	 Student[] students;
	 
	 //初始化方法,必须首先调用
	 public void init() {
		 students = new Student[2];
		 Student s1 = new Student();
		 s1.setName("张三");
		 s1.setAge(16);
		 students[0] = s1;
		 Student s2 = new Student();
		 s2.setName("李四");
		 s2.setAge(17);
		 students[1] = s2;
	 }
	 
	 //添加学生
	 public void add(Student s) {
		 //添加到数组
	 }
	 
	 //修改学生
	 public void update(Student s) {
		 //修改到数组
	 }
	 
	 //....
	
}
