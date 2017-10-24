package com.hxj.extend1;
/**
 * The type Animal must be an abstract class to define abstract methods
 * �����ࣺ
 *   abstract����
 *   �����г��󷽷�
 *   Ҳ�����зǳ��󷽷�
 *   ���󷽷�û�з����壬���Է���������ʵ��
 * @author hxj
 *
 */
public abstract class Animal {

	String nickName;//�ǳ�
	String color;//��ɫ
	String brand;//Ʒ��
	
	public void breath() {
		System.out.println(nickName+"�����");
	}
	
	public void run() {
		System.out.println(nickName+"����");
	}
	
	//�÷����޷����������������ȥ����ʵ��
    public abstract void eat();
	
}
