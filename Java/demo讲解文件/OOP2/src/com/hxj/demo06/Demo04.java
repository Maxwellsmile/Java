package com.hxj.demo06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo04 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		//�������
		map.put("1001", "����");
		map.put("1002", "����");
		map.put("1003", "����");
		map.put("1004", "����");
		map.put("1005", "haha");
		map.put("1006", "jack");
		System.out.println(map);
		//��ѯ ͨ������ȡֵ
		String result = map.get("1001").toString();
		System.out.println(result);
		//�Ƴ�
		System.out.println(map.remove("1001"));
		System.out.println(map);
		
		//�޸� ͨ�����Ѿ����ڵ�key�����и���
		map.put("1006", "�ܿ�");
		System.out.println(map);
		
		//�ж�
//		System.out.println(map.containsKey("1004"));
//		System.out.println(map.isEmpty());
//		System.out.println(map.size());
//		map.clear();
//		System.out.println(map.size());
//		System.out.println(map);
		
		//
		Set<String> keys = map.keySet();//���Խ����е�keyת��һ��Set����
		for(String key:keys) {
			System.out.println(key+"    "+map.get(key));
		}
		
		System.out.println("--------------------------");
		Set<Entry<String,Object>> entrys =  map.entrySet();
		for(Entry<String,Object> entry:entrys) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println("------------------------");
		Collection<Object> coll = map.values();
		for(Object o:coll) {
			System.out.println(o);
		}
	}
	
}
