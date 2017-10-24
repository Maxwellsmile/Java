package com.hxj.demo06;

import java.util.HashSet;
import java.util.Iterator;

public class Demo05 {

	public static void main(String[] args) {
		//ÎÞÐò
		HashSet<String> set = new HashSet<String>();
		set.add("jack");
		set.add("baby");
		set.add("haha");
		set.add("xiixiixix");
		set.add("kkkkkk");
		
		System.out.println(set);
		
		set.remove("jack");
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String s:set) {
			System.out.println(s);
		}
		
	}
	
}
