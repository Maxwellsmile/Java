package com.hxj.demo;

public class Demo01 {
	
	public static void haha(String name) {
		System.out.println("-------haha----------"+name);
	}
	
	public static int add(int a1,int a2) {
		return a1+a2;
	}

	public static void main(String[] args) {
		
		haha("����");
		
		int c = add(12,13);
		System.out.println("12+13="+add(12,13));
		
		/**
		 * ���� byte1 short2 int(Ĭ��)4 long8
		 *  ����ת����
		 *     С--->��  ֱ��ת
		 *     ��--->С  ǿ��ת��
		 * С��(������)
		 *   float 4
		 *   double 8
		 * �ַ�  char 2  0~65535
		 *   ASCII���
		 *     0-127
		 *     0-----��
		 *     1-----��
		 *     48----��'0'
		 *     65----��'A'
		 *     97----��'a'
		 *   ISO8859-1
		 *   GBK2312
		 *   GBK  2���ֽڱ�ʾһ�������ַ�
		 *   Unicode
		 *   UTF-8 3���ֽڱ�ʾһ�������ַ�
		 * ����
		 */
		
		/*int i = 4;
		byte b = (byte)i;
		System.out.println(b);*/
		
		/*byte a = 2;
		byte b = (byte)(a+2);*/
		
		/*byte a = 2;
		byte b = 3;
		byte c = (byte)(a+b);*/
		
		//long l = 23L;
		
//		char c1 = '0';
//		System.out.println((int)c1);
//		char c2 = '.';
//		System.out.println((int)c2);
//		char c3 = 'a';
//		System.out.println((int)c3);
//		char c4 = '��';
//		System.out.println((int)c4);
		
		
		String s1 = "HelloWorld";
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.equals("HelloWorld"));
		s1 = "aa�����黨mp3";
		System.out.println(s1.substring(0, 4));//��ȡ�ַ���  �����黨.mp3
		System.out.println(s1.endsWith(".mp3"));
		System.out.println(s1.startsWith("ab"));
		System.out.println(s1.contains("mp3"));
		s1 = "              Hello World          ";
		System.out.println(s1.trim().equals("HelloWorld"));//ȥ�ո�
		s1 = "Helloaaalo";
		System.out.println(s1.indexOf("lo"));
		System.out.println(s1.lastIndexOf("lo"));
		System.out.println(s1.indexOf("lo", 5));
		
		
		/*
		 * ���� ����
		 *  
		 *  �����������������У�
			public(�������η�) int(����ֵ����) length(������) (�����б�) {
		        return ����ֵ;
		    }
		    
		    public void(�޷���ֵ) ������(�����б�){
		         return;
		    } 
		    
		    ��̬static���εķ�������ͨ������ֱ�ӵ��� 
		    Math.abs(-23);
		    �Ǿ�̬���εķ�������ͨ���������
		    String s1 = "Hello";
		    s1.length();
	    */
		System.out.println("---------------------------------------------");
		System.out.println(Math.abs(-23));//����ֵ
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.random()); 
		/*
		 * 0.0<=Math.random()<1.0  23~78
		 * 0~10     0.0<=Math.random()*(10+1)<=10.0
		 * 2~12     2.0<=Math.random()*(10+1)+2<12.0 
		 * 
		 * Math.random()*(end-start+1)+start
		 */
		System.out.println("------------------------------------");
		int start = 2;
		int end = 12;
		for(int i = 0;i<10;i++) {
			int number = (int)(Math.random()*(end-start+1)+start);
			System.out.println(number);
		}
		System.out.println("------------------------------------");
		
		System.out.println(Math.floor(3.14));//С�ڵ���Ŀ��ֵ��������� 
		System.out.println(Math.ceil(3.14));//���ڵ���Ŀ��ֻ����С����
		double kk = -3.7;
		System.out.println(Math.round(kk));
		System.out.println(Math.floor(kk+0.5));
		System.out.println(Math.sqrt(9));//���������
		
		System.out.println(Math.max(2, 6));
		System.out.println(Math.min(2, 6));
		
		
		//����
		/**
		       *        1    0    ceng*2+1  5   ceng-1-i  
		      ***       3    1              4
		     *****      5    2              3
		    *******          3              2
		   *********         4              1
		  ***********        5              0
		 */
		int ceng = 3;
		for(int i = 0;i<ceng;i++) {
			for(int k = 0;k<ceng-1-i;k++) {
				System.out.print(" ");
			}
			for(int j = 0+97;j<i*2+1+97;j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		/**
		 * �����һ��Сд��ĸ������ĸ����5��λ�ú������
			��'a'���'f'��'w'���'b����
			a     97
			b     98
			c
			.
			.
			.
			w
			x
			y
			z    112 
			.
			.
		 */
		char s = 'w';
		char e = (char)(s+5);
		if(e>'z') {
			e = (char)(e-26);
		}
		System.out.println("��"+s+"��ʼ");
		System.out.println("�ƺ�5����"+e);
		
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum+=i;
		}
		
		/*
		 * ���Լ����
		 *   10   15
		 *   10---1
		 *     15 && 10
		 *     
		 *   3     9
		 *   9-----3*9 
		 *     3 && 9
		 */
		
		
		/**
		 * �������ͣ�
		 *   ����
		 *   ��
		 *   �ӿ�
		 */
		
		/**
		 * java���
		 */
	}
	
	
	
}
