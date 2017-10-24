package com.hxj.extend;

public class Animal {

	String nickName;//昵称
	String color;//颜色
	String brand;//品种
	
	public void breath() {
		System.out.println(nickName+"会呼吸");
	}
	
	public void run() {
		System.out.println(nickName+"会跑");
	}
	
    public void eat() {
		System.out.println(nickName+"会吃");
	}
	
}
