package com.hxj.buchong;
/**
 * �̳е����ݲ��������췽��
 * @author hxj
 *
 */
public class Cat extends Animal{

	public Cat() {
		super();//super��ʾ���������,Ĭ�ϴ����ڹ��췽���ĵ�һ��
		System.out.println("Cat�Ŀչ���");
	}
	
	@Override
	public void setNickName(String nickName) {
		super.setNickName(nickName);
	}
	
}
