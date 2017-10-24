package com.hxj.demo02;

public class Demo02 {

	public static void main(String[] args) {
		
		
		String s = "";
		long start = System.currentTimeMillis();
		for(int i = 0;i<10000;i++) {
			s+=i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		StringBuilder sb = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i = 0;i<10000;i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
}
