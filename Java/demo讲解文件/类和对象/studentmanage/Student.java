package com.hxj.studentmanage;

public class Student {

	/*
	 * ȫ�ֱ���
	 * ��Ա���������������
	 */
	private String name;//��������û�и�ֵ�������Ĭ��ֵ����null
	private int age;//Ĭ��ֵ��0
	
	//ͨ���÷�����name���Ը�ֵ
	public void setName(String name1){
		name = name1;
	}
	
	//ͨ���÷�����ȡname����ֵ
	public String getName() {
		return name;
	}
	
	public void setAge(int age1){
		if(age1>120 || age1<0) {
			System.out.println("���������䲻�ں���Χ�ڣ������¸�ֵ");
			return;
		}
		age = age1;
	}
	
	public int getAge() {
		return age;
	}
	
	/*
	 * ��Ա����
	 * �������������ʲô
	 */
	public void intro() {
		introPrev();
		System.out.println("�ҵ������ǣ�"+name+",�ҵ������ǣ�"+age);
	}
	
	//������װ֮���ⲿ���޷����ã�����˽�з���һ�����������ķ����ṩ����
	private void introPrev() {
		System.out.println("�������ҵ����ҽ��ܣ�");
	}
	
}
