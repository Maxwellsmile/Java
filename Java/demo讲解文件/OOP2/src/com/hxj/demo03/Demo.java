package com.hxj.demo03;
/**
 * 静态成员变量
 * 静态块
 * 非静态成员变量
 * 构造块
 * 构造方法
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
