package com.hxj.demo06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo04 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		//添加内容
		map.put("1001", "张三");
		map.put("1002", "李四");
		map.put("1003", "王五");
		map.put("1004", "赵六");
		map.put("1005", "haha");
		map.put("1006", "jack");
		System.out.println(map);
		//查询 通过键获取值
		String result = map.get("1001").toString();
		System.out.println(result);
		//移除
		System.out.println(map.remove("1001"));
		System.out.println(map);
		
		//修改 通过给已经存在的key来进行覆盖
		map.put("1006", "杰克");
		System.out.println(map);
		
		//判断
//		System.out.println(map.containsKey("1004"));
//		System.out.println(map.isEmpty());
//		System.out.println(map.size());
//		map.clear();
//		System.out.println(map.size());
//		System.out.println(map);
		
		//
		Set<String> keys = map.keySet();//可以将所有的key转成一个Set集合
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
