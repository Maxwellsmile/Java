package com.hxj.extend;
/**
 * 访问修饰符：
 *    public 公有
 *    protected 本类  本包 子类
 *    默认  本类  本包
 *    private 本类
 * 类：描述对象的属性和方法
 * 子类继承父类：
 *   extends
 *   子类可以直接使用父类中非private的属性和方法
 *   父类中有些方法无法满足子类的需求，子类可以重写父类的方法  
 *   	重写：
 *        方法名相同 参数列表相同 返回值类型相同 
 *        访问修饰符：访问范围不能缩小
 *        方法内容可能不同
 * @author hxj
 *
 */
public class Cat extends Animal{
	
	 @Override
	 public void eat() {
		System.out.println(nickName+"会吃鱼");
	 }
	
}
