package com.hxj.demo03;
/**
 * ��̬��Ա����
 * ��̬��
 * �Ǿ�̬��Ա����
 * �����
 * ���췽��
 * @author hxj
 *
 */
public class Demo
{
	static Demo d =  new Demo();
	Demo()
	{
		System.out.println("Demo...........");
	}
}
//java.lang.StackOverflowError
class Test
{
	public static void main(String[] args)
	{
		new Demo();
		new Demo();
	}
}
