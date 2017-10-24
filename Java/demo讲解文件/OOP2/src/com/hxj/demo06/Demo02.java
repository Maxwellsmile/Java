package com.hxj.demo06;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		
		System.out.println(list);
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------------------------------");
		//获取迭代器
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("--------foreach--------------------");
		for(String s:list) {
			System.out.println(s);
		}
		
		
	}
	
}
