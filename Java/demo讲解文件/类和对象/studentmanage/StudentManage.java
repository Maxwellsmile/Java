package com.hxj.studentmanage;

import com.hxj.demo1.Student;

/**
 * ѧ�������ࣺ
 *    ����ѧ����Ϣ(ʹ�õ���������) 
 * @author hxj
 *
 */
public class StudentManage {

	 Student[] students;
	 
	 //��ʼ������,�������ȵ���
	 public void init() {
		 students = new Student[2];
		 Student s1 = new Student();
		 s1.setName("����");
		 s1.setAge(16);
		 students[0] = s1;
		 Student s2 = new Student();
		 s2.setName("����");
		 s2.setAge(17);
		 students[1] = s2;
	 }
	 
	 //���ѧ��
	 public void add(Student s) {
		 //��ӵ�����
	 }
	 
	 //�޸�ѧ��
	 public void update(Student s) {
		 //�޸ĵ�����
	 }
	 
	 //....
	
}
