package com.hxj.demo02;
/**
 * Object:
 *   equals() == ��д
 *   toString()
 *   hashCode()
 *   getClass().getName()
 *   Integer.toHexString(int param)
 *   
 *   ��װ��----����֮���ת��
 *   int  --- Integer
 *   double   Double
 *   
 * @author hxj
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		String s1 = new String("zhangsan");
		String s2 = new String("zhangsan");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
		
		
	    Student stu1 = new Student("zhangsan",30);
	    Student stu2 = new Student("zhangsan",30);
	    System.out.println(stu1.equals(stu2));
	    System.out.println(stu1==stu2);
	    
	    
	    System.out.println(stu1);
	    System.out.println(stu1.toString());
	    
	    System.out.println(stu1.getClass().getName());//���Եõ����ȫ����
	    System.out.println(stu1.hashCode());//�õ�����Ĺ�ϣֵ
	    System.out.println(Integer.toHexString(stu1.hashCode()));//�õ�����Ĺ�ϣֵ��16�����ַ���
	    
	    
	    
	    //System.out.println(s1.equals(stu1));
	    
	    
	    System.out.println("-----------------------------");
	    
	    String str = "abc";
	    /**
	     * h = 0
	     * h = 31 * h + 97; ---->97
	     * h = 31 * 97 + 98;---->3105
	     * h = 31 * 3105 + 99;---->96354
	     */
	    System.out.println(str.hashCode());
	    
	    String str1 = new String("abc");
	    System.out.println(str1.hashCode());
	    System.out.println("***********");
	    System.out.println("zhangsan".hashCode()+30);
	    System.out.println(stu1.hashCode());
	    System.out.println(stu2.hashCode());
	    
	}
	
}
