package com.hxj.studentmanage;

public class Student {

	/*
	 * 全局变量
	 * 成员变量声明类的属性
	 */
	private String name;//对象类型没有赋值的情况下默认值都是null
	private int age;//默认值是0
	
	//通过该方法给name属性赋值
	public void setName(String name1){
		name = name1;
	}
	
	//通过该方法获取name属性值
	public String getName() {
		return name;
	}
	
	public void setAge(int age1){
		if(age1>120 || age1<0) {
			System.out.println("您给的年龄不在合理范围内，请重新赋值");
			return;
		}
		age = age1;
	}
	
	public int getAge() {
		return age;
	}
	
	/*
	 * 成员方法
	 * 该类事物可以做什么
	 */
	public void intro() {
		introPrev();
		System.out.println("我的姓名是："+name+",我的年龄是："+age);
	}
	
	//方法封装之后外部类无法调用，所以私有方法一般用来给核心方法提供服务
	private void introPrev() {
		System.out.println("以下是我的自我介绍：");
	}
	
}
