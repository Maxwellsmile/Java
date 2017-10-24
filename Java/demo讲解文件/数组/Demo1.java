package com.hxj.demo;

public class Demo01 {
	
	public static void haha(String name) {
		System.out.println("-------haha----------"+name);
	}
	
	public static int add(int a1,int a2) {
		return a1+a2;
	}

	public static void main(String[] args) {
		
		haha("张三");
		
		int c = add(12,13);
		System.out.println("12+13="+add(12,13));
		
		/**
		 * 整数 byte1 short2 int(默认)4 long8
		 *  类型转换：
		 *     小--->大  直接转
		 *     大--->小  强制转换
		 * 小数(浮点数)
		 *   float 4
		 *   double 8
		 * 字符  char 2  0~65535
		 *   ASCII码表
		 *     0-127
		 *     0-----》
		 *     1-----》
		 *     48----》'0'
		 *     65----》'A'
		 *     97----》'a'
		 *   ISO8859-1
		 *   GBK2312
		 *   GBK  2个字节表示一个中文字符
		 *   Unicode
		 *   UTF-8 3个字节表示一个中文字符
		 * 布尔
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
//		char c4 = '中';
//		System.out.println((int)c4);
		
		
		String s1 = "HelloWorld";
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.equals("HelloWorld"));
		s1 = "aa开心麻花mp3";
		System.out.println(s1.substring(0, 4));//截取字符串  开心麻花.mp3
		System.out.println(s1.endsWith(".mp3"));
		System.out.println(s1.startsWith("ab"));
		System.out.println(s1.contains("mp3"));
		s1 = "              Hello World          ";
		System.out.println(s1.trim().equals("HelloWorld"));//去空格
		s1 = "Helloaaalo";
		System.out.println(s1.indexOf("lo"));
		System.out.println(s1.lastIndexOf("lo"));
		System.out.println(s1.indexOf("lo", 5));
		
		
		/*
		 * 方法 函数
		 *  
		 *  方法必须声明在类中：
			public(访问修饰符) int(返回值类型) length(方法名) (参数列表) {
		        return 返回值;
		    }
		    
		    public void(无返回值) 方法名(参数列表){
		         return;
		    } 
		    
		    静态static修饰的方法可以通过类名直接调用 
		    Math.abs(-23);
		    非静态修饰的方法必须通过对象调用
		    String s1 = "Hello";
		    s1.length();
	    */
		System.out.println("---------------------------------------------");
		System.out.println(Math.abs(-23));//绝对值
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
		
		System.out.println(Math.floor(3.14));//小于等于目标值的最大整数 
		System.out.println(Math.ceil(3.14));//大于等于目标只得最小整数
		double kk = -3.7;
		System.out.println(Math.round(kk));
		System.out.println(Math.floor(kk+0.5));
		System.out.println(Math.sqrt(9));//三角形面积
		
		System.out.println(Math.max(2, 6));
		System.out.println(Math.min(2, 6));
		
		
		//层数
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
		 * 输入的一个小写字母、将字母后移5个位置后输出。
			如'a'变成'f'，'w'变成'b‘。
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
		System.out.println("从"+s+"开始");
		System.out.println("推后5个到"+e);
		
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum+=i;
		}
		
		/*
		 * 最大公约数：
		 *   10   15
		 *   10---1
		 *     15 && 10
		 *     
		 *   3     9
		 *   9-----3*9 
		 *     3 && 9
		 */
		
		
		/**
		 * 引用类型：
		 *   数组
		 *   类
		 *   接口
		 */
		
		/**
		 * java类库
		 */
	}
	
	
	
}
