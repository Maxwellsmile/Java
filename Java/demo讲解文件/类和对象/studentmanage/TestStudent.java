package com.hxj.studentmanage;

import com.hxj.demo1.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		Student[] students = new Student[2];
		//��ʼ��
		Student s1 = new Student();
		s1.setName("����");
		s1.setAge(16);
		students[0] = s1;
		Student s2 = new Student();
		s2.setName("����");
		s2.setAge(17);
		students[1] = s2;
		
		//���
		//.....add....
		//�޸�
		//ɾ��
		//���
		//.....add....
	}
	
}
