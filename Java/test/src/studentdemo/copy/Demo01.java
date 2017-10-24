package studentdemo.copy;
/**
 * 知识点：
 *   构造方法
 *   方法重载 ：add
 *   静态：
 *     静态：类名.方法名  类名.属性名
 *     非静态：对象.方法名  对象.属性名
 * @author zhouyong
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		/*
		 * student类的构造方法
		 */
		student s1 = new student();
		System.out.println(s1.getName()+"   "+s1.getAge());
		student s2 = new student("张三",20);
		System.out.println(s2.getName()+"   "+s2.getAge());
		s2.setName("张三丰");
		System.out.println(s2.getName()+"   "+s2.getAge());
		student s3 = new student("", 0, 1, "", 1);
	}
	
}
