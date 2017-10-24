package studentdemo.copy;
/**
 * 组成类的属性和方法的运行时间
 * @author zhouyong
 *
 */
public class Animal {

	//静态成员属性
	static String name1 = "静态成员属性";
	//非静态成员属性
	String name2 = "非静态成员属性";
	
	//静态块
	static{
		System.out.println(name1);
		System.out.println("静态块");
	}
	
	//构造块
	{
		System.out.println(name2);
		System.out.println("构造块");
	}
	
	//构造方法
	public Animal() {
		System.out.println("构造方法");
	}
	
}
