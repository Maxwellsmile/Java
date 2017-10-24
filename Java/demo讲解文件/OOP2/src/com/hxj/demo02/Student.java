package com.hxj.demo02;

public class Student {

	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void intro() {
		System.out.println("�ҵ����֣�"+this.name+"   ���䣺"+this.age);
	}
	
	//ϣ��equals�Աȶ������������
	@Override
	public boolean equals(Object obj) {
		//this->stu1   obj->stu2   
		if(this==obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.name.equals(stu.name) && this.age==stu.age) {
				return true;
			}
		}
		return false;
	}
	
	//ϣ���ڴ�ӡStudent��Ķ���ʱ����ӡ���Ǹö��������ֵ
	@Override
	public String toString() {
		return "�ҵ����֣�"+this.name+"   ���䣺"+this.age;
	}
	
	//0*34 6*56   1*34 5*56
	@Override
	public int hashCode() {
		return name.hashCode()*137+age*45;
	}
	
}
