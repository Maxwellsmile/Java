package com.hxj.demo03;

public class Student {

	static String str = "��̬��Ա����";
	String str1 = "�Ǿ�̬��Ա����";
	
	static {
		System.out.println(str);
		System.out.println("��̬��");
	}
	
	{
		System.out.println(str1);
		System.out.println("�����");
	}
	
	Student(){
		System.out.println("���췽��");
	}
	
}
