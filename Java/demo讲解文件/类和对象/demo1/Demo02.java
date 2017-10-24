package com.hxj.demo1;

import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.name = "张三";
//		s1.age = 1200;
		/*
		 * 年龄赋值不安全
		 * 面向对象：
		 * 1、封装
		 *   步骤：将类的成员属性私有化，但是私有属性外部类无法调用，属性无法使用(赋值 取值)
		 *        提供共有的方法给外部访问属性
		 *        私有方法一般给本类的核心方法提供服务
		 * 2、继承
		 * 3、多态
		 */
//		s1.setName("张三");
//		s1.setAge(16);
//		
//		System.out.println(s1.getName());
//		System.out.println(s1.getAge());
//		
//		s1.intro();
		
		/*
		 * 学生管理系统：
		 * 	  添加学生信息  
		 *   查看学生信息
		 *   修改学生信息
		 *   删除学生
		 *   
		 *   管理学生信息
		 *      学生姓名        年龄      班级
		 *       张三                20    1
		 *       李四                21    1
		 *       王五                20    2	
		 *       
		 *     数组：存储纵向数据
		 *     Student s = new Student();
		 *     s.setName("张三");
		 *     s.setAge(20);
		 *     对象：存储横向数据
		 *     
		 *    类型[] 变量名 = new 类型[长度];
		 */
		
		Student[] students = new Student[2];
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(16);
		students[0] = s1;
		Student s2 = new Student();
		s2.setName("李四");
		s2.setAge(17);
		students[1] = s2;
		
		System.out.println(Arrays.toString(students));
		
		for(int i = 0;i<students.length;i++) {
			Student s = students[i];
			//System.out.println(i+"   "+s.getName()+"   "+s.getAge());
			s.intro();
		}
	}
	
}
