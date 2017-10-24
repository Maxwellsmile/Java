package com.hxj.demo06;

import java.util.ArrayList;

/**
 * 基础语法
 * 面向对象
 * 类库：
 *   集合框架 数据结构
 *   文件 读写 IO
 *   多线程
 *   网络编程
 * @author hxj
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		/*
		 * ArrayList --- 数组
		 * HashMap
		 *    添加数据
		 *    获取数据
		 *    删除数据
		 *    修改数据
		 *    判断的方法
		 *    获取的方法
		 *    遍历
		 */
		ArrayList list = new ArrayList();
		list.add(1);
		list.add('a');
		list.add(34.5);
		list.add("hello");
		list.add(list);
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println(list.remove(3));
		
		System.out.println(list);
		
		
		list.add(2, "插队");
		
		System.out.println(list);
		
		list.set(2, "替换");
		
		System.out.println(list);
		
		
//		list.add(e);
//		list.get(index);
//		list.remove(index)
//		list.add(2, 4);//1243
//		list.set(index, element)
		
//		list.size();
//		list.isEmpty();
//		list.contains(o);
//		list.clear();
//		list.indexOf(o)
//		list.removeAll(c)//12345   12389
//		list.retainAll(c)//
//		list.subList(fromIndex, toIndex)
		
		
		
		
	}
	
}
