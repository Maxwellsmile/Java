package studentdemo.copy;
/**
 * 类：
 *   成员属性
 *   构造方法
 *   成员方法
 * @author zhouyong
 *
 */
public class student {
	 private String name;
	 private int age;
	 private int classes;
	 private String magor;//专业
	 private int number;
	 
	 /*
	  * 方法重载：
	  *   int add(int a1,int a2)
	  *   float add(float a1,float a2)
	  *   double add(double d1,double d2)
	  *   同一个类中，执行功能相似的方法
	  *   1、方法名相同
	  *   2、参数列表不同(个数不同,顺序不同,类型不同)
	  *   3、返回值类型可以不同
	  */
	 
	 public student() {
		 System.out.println("---student--空构造-----");
	 }
	 
	 public student(String name1,int age1) {//形参列表
		 System.out.println("---student--非空构造-----");
		 name=name1;
		 age=age1;
	 }
	 public student(int age1,String name1) {//形参列表
		 System.out.println("---student--非空构造-----");
		 name=name1;
		 age=age1;
	 }
	 
	 public student(String name1,int age1,int classes1,String magor1,int number1) {
		 System.out.println("---student--非空构造-----");
		 name=name1;
		 age=age1;
		 classes=classes1;
		 magor = magor1;
		 number = number1;
	 }
	
	 public void setName(String name1) {
	      name=name1;
	   }
	 public String getName() {
	      return name;
	   }
	 public void setAge(int age1) {
		 if(30<age1 && age1<0) {
			 System.out.println("请给出合适的年龄");
			 return;
		 }
		      age=age1;
		   }
	 public int getAge() {
		      return age;
		   }
	 public void setClasses(int classes1) {
		 classes=classes1;
	   }
	 public int getClasses() {
	      return classes;
	   }
	 public void setMagor(String magor1) {
		 magor=magor1;
	   }
	 public String getMagor() {
	      return magor;
	   }
	 public void setNumber(int number1) {
		 number=number1;
	   }
	 public int getNumber() {
	      return number;
	   }
	 
}

