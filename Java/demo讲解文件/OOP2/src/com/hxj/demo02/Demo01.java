package com.hxj.demo02;

public class Demo01 {

	public static void main(String[] args) {
		
		String s1 = "zhangsan";
		String s2 = "zhangsan";
		System.out.println(s1==s2);
		
		String s3 = new String("zhangsan");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
	}
	
}
