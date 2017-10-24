package com.hxj.buchong;
//this  自动生成代码
public class Animal {

	private String nickName;//昵称
	private String color;//颜色
	private String brand;//品种
	
	public Animal() {
		System.out.println("Animal的空构造");
	}
	public Animal(String nickName, String color) {
		this.nickName = nickName;
		this.color = color;
	}
	public Animal(String nickName, String color, String brand) {
		this.nickName = nickName;
		this.color = color;
		this.brand = brand;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void setNickName(String nickName) {
		System.out.println(this);
		//this在方法中使用，表示本类的对象，当前调用该方法的对象
		this.nickName = nickName;
	}*/
	
}
