package com.hxj.extend1;

public class TestDemo01 {

	public static void main(String[] args) {
		//�������޷�ʵ����
//		Animal a = new Animal();
//		a.eat();
		
		/**
		 * ����ת����С-->��   ��--->С
		 */
		
		Cat c = new Cat();
		System.out.println(c);
		c.nickName = "�ӷ�è";
		c.breath();
		c.run();
		c.eat();
		
		Dog dog = new Dog();
		dog.nickName = "����";
		dog.breath();
		dog.run();
		dog.eat();
		
		Animal a1 = c;//���������������
		System.out.println(a1);
		Animal aa = new Cat();
		System.out.println(aa);
		
		Cat c1 = (Cat)a1;
		System.out.println(c1);
		System.out.println("------------------------");
		
		Animal a2 = dog;
//		Cat c2 = (Cat)a2;//java.lang.ClassCastException
		//�ж�a2�Ƿ����ǿתΪCat���ͣ�������ת
		if(a2 instanceof Dog) {
			System.out.println("��ʼת��....");
			Dog c2 = (Dog)a2;
			System.out.println(c2);
		}
		
	}
	
}
