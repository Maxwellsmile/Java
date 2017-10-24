package com.hxj.demo06;

import java.util.ArrayList;
/**
 * 第1次 add--------10
 * 第11次 add-------10*1.5=15
 * 第16次 add-------15*1.5=22
 * 
 * @author hxj
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("张三",20));
		list.add(new Student("jack",24));
		Student s3 = new Student("lily",23);
		list.add(s3);
		list.add(new Student("rose",22));
		
		for(Student stu:list) {
			System.out.println(stu);
		}
		
		list.set(1, new Student("杰克", 23));
		
		System.out.println(list);
		
//		list.remove(1);
//		
//		System.out.println(list);
		
//		list.remove(s3);
//		
//		System.out.println(list);
		
		System.out.println(list.remove(new Student("lily",23)));
		
		System.out.println(list);
	}
	
}
