package com.hxj.demo06;

import java.util.ArrayList;

/**
 * �����﷨
 * �������
 * ��⣺
 *   ���Ͽ�� ���ݽṹ
 *   �ļ� ��д IO
 *   ���߳�
 *   ������
 * @author hxj
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		/*
		 * ArrayList --- ����
		 * HashMap
		 *    �������
		 *    ��ȡ����
		 *    ɾ������
		 *    �޸�����
		 *    �жϵķ���
		 *    ��ȡ�ķ���
		 *    ����
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
		
		
		list.add(2, "���");
		
		System.out.println(list);
		
		list.set(2, "�滻");
		
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
