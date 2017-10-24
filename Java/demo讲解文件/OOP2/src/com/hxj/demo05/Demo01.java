package com.hxj.demo05;

public class Demo01 {

	public static void main(String[] args) {
		//int ---> Integer  自动装箱
		int i = 23;
		Integer in1 = new Integer(i);
		Integer in2 = new Integer("23");
		Integer in3 = i;
		
		//Integer ----> int 自动拆箱
		int ii = in1;
		int ii1 = in1.intValue();
		
		System.out.println(in1+in2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String str = "10100011";
		int number = Integer.parseInt(str,2);
		System.out.println(number);
	}
	
}
