package studentdemo.copy;
/**
 * �ࣺ
 *   ��Ա����
 *   ���췽��
 *   ��Ա����
 * @author zhouyong
 *
 */
public class student {
	 private String name;
	 private int age;
	 private int classes;
	 private String magor;//רҵ
	 private int number;
	 
	 /*
	  * �������أ�
	  *   int add(int a1,int a2)
	  *   float add(float a1,float a2)
	  *   double add(double d1,double d2)
	  *   ͬһ�����У�ִ�й������Ƶķ���
	  *   1����������ͬ
	  *   2�������б�ͬ(������ͬ,˳��ͬ,���Ͳ�ͬ)
	  *   3������ֵ���Ϳ��Բ�ͬ
	  */
	 
	 public student() {
		 System.out.println("---student--�չ���-----");
	 }
	 
	 public student(String name1,int age1) {//�β��б�
		 System.out.println("---student--�ǿչ���-----");
		 name=name1;
		 age=age1;
	 }
	 public student(int age1,String name1) {//�β��б�
		 System.out.println("---student--�ǿչ���-----");
		 name=name1;
		 age=age1;
	 }
	 
	 public student(String name1,int age1,int classes1,String magor1,int number1) {
		 System.out.println("---student--�ǿչ���-----");
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
			 System.out.println("��������ʵ�����");
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

