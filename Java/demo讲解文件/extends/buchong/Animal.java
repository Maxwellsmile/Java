package com.hxj.buchong;
//this  �Զ����ɴ���
public class Animal {

	private String nickName;//�ǳ�
	private String color;//��ɫ
	private String brand;//Ʒ��
	
	public Animal() {
		System.out.println("Animal�Ŀչ���");
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
		//this�ڷ�����ʹ�ã���ʾ����Ķ��󣬵�ǰ���ø÷����Ķ���
		this.nickName = nickName;
	}*/
	
}
