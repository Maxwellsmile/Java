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
		System.out.println("我的名字："+this.name+"   年龄："+this.age);
	}
	
	//希望equals对比对象的名字年龄
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
	
	//希望在打印Student类的对象时，打印的是该对象的属性值
	@Override
	public String toString() {
		return "我的名字："+this.name+"   年龄："+this.age;
	}
	
	//0*34 6*56   1*34 5*56
	@Override
	public int hashCode() {
		return name.hashCode()*137+age*45;
	}
	
}
