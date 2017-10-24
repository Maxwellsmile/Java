package com.hxj.demo05;

public class Demo {

	String str;
	Byte b;
	Short s;
	Integer i;
	Long l;
	Float f;
	Double d;
	Boolean bb;
	Character c;
	
	@Override
	public String toString() {
		return "Demo [str="+str+"  b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", bb=" + bb + ", c="
				+ c + "]";
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
	}
}
