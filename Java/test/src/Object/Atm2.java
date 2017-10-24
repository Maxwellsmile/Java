//4设计一个程序，完成ATM机登录、存钱、取钱、查看余额、转账、退出登录等功能。


package Object;

import java.util.ArrayList;
import java.util.Scanner;

public class Atm2 {
	public static void main(String[] args) {
		ArrayList<AtmTest2> list=new ArrayList();
		AtmTest2 s1=new AtmTest2("张三", 123456, 654321, 1000);
		//String name1,int password1,int number1,double money1
		AtmTest2 s2=new AtmTest2("李四", 654321, 123456, 10000);
		list.add(s1);
		list.add(s2);
		
		Scanner scan=new Scanner(System.in);
		AtmManage2 atm=new AtmManage2();
		System.out.println("请输入您的银行卡账号");
		int x=scan.nextInt();
		System.out.println("请输入您的用户名");
		String y=scan.next();
		System.out.println("请输入您的密码");
		int z=scan.nextInt();
		atm.land(list, x, y, z);
		while(true) {
			System.out.println("请选择您接下来要进行的操作：1.存钱、2.取钱、3.查看余额、4.转账、5.重新登陆、6.退出登录");
			int m=scan.nextInt();
			if(m==1) {
				System.out.println("请输入您要存的钱数");
				double cun=scan.nextDouble();
				atm.deposit(list,x,cun);
			}
			if(m==2) {
				System.out.println("请输入您取出的钱数");
				double qu=scan.nextDouble();
				atm.draw(list,x,qu);
			}
			if(m==3) {
				System.out.println(x);
				atm.view(list,x);
			}
			if(m==4) {
				System.out.println("请输入您要转入的银行卡账号");
				int a=scan.nextInt();
				System.out.println("请输入您取出的钱数");
				double zhuan=scan.nextDouble();
				atm.forward(list,x, zhuan, a);
			}
			if(m==5) {
				System.out.println("请输入您的银行卡账号");
				x=scan.nextInt();
				System.out.println("请输入您的用户名");
				y=scan.next();
				System.out.println("请输入您的密码");
				z=scan.nextInt();
				atm.land(list,x, y, z);
			}
			if(m==6) {
				System.out.println("ATM机欢迎您");
				break;
			}
		}
		
		
	}

	
}

