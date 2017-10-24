package com.hxj.extend1;

public class TestDemo01 {

	public static void main(String[] args) {
		//抽象类无法实例化
//		Animal a = new Animal();
//		a.eat();
		
		/**
		 * 类型转换：小-->大   大--->小
		 */
		
		Cat c = new Cat();
		System.out.println(c);
		c.nickName = "加菲猫";
		c.breath();
		c.run();
		c.eat();
		
		Dog dog = new Dog();
		dog.nickName = "旺财";
		dog.breath();
		dog.run();
		dog.eat();
		
		Animal a1 = c;//父类声明子类对象
		System.out.println(a1);
		Animal aa = new Cat();
		System.out.println(aa);
		
		Cat c1 = (Cat)a1;
		System.out.println(c1);
		System.out.println("------------------------");
		
		Animal a2 = dog;
//		Cat c2 = (Cat)a2;//java.lang.ClassCastException
		//判断a2是否可以强转为Cat类型，可以再转
		if(a2 instanceof Dog) {
			System.out.println("开始转换....");
			Dog c2 = (Dog)a2;
			System.out.println(c2);
		}
		
	}
	
}
