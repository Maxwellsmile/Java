package com.hxj.demo1;

import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.name = "����";
//		s1.age = 1200;
		/*
		 * ���丳ֵ����ȫ
		 * �������
		 * 1����װ
		 *   ���裺����ĳ�Ա����˽�л�������˽�������ⲿ���޷����ã������޷�ʹ��(��ֵ ȡֵ)
		 *        �ṩ���еķ������ⲿ��������
		 *        ˽�з���һ�������ĺ��ķ����ṩ����
		 * 2���̳�
		 * 3����̬
		 */
//		s1.setName("����");
//		s1.setAge(16);
//		
//		System.out.println(s1.getName());
//		System.out.println(s1.getAge());
//		
//		s1.intro();
		
		/*
		 * ѧ������ϵͳ��
		 * 	  ���ѧ����Ϣ  
		 *   �鿴ѧ����Ϣ
		 *   �޸�ѧ����Ϣ
		 *   ɾ��ѧ��
		 *   
		 *   ����ѧ����Ϣ
		 *      ѧ������        ����      �༶
		 *       ����                20    1
		 *       ����                21    1
		 *       ����                20    2	
		 *       
		 *     ���飺�洢��������
		 *     Student s = new Student();
		 *     s.setName("����");
		 *     s.setAge(20);
		 *     ���󣺴洢��������
		 *     
		 *    ����[] ������ = new ����[����];
		 */
		
		Student[] students = new Student[2];
		Student s1 = new Student();
		s1.setName("����");
		s1.setAge(16);
		students[0] = s1;
		Student s2 = new Student();
		s2.setName("����");
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
