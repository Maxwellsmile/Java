//4设计一个程序，完成ATM机登录、存钱、取钱、查看余额、转账、退出登录等功能。


package Object;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		AtmManage atm=new AtmManage();
		System.out.println("请输入银行账号");
		int x=scan.nextInt();
		System.out.println("请输入用户名");
		String y=scan.next();
		System.out.println("请输入密码");
		int z=scan.nextInt();
		atm.land(x, y, z);
		while(true) {
			System.out.println("请选择您要进行的操作：1.存钱、2.取钱、3.查看余额、4.转账、5.重新登陆、6.退出登录");
			int m=scan.nextInt();
			if(m==1) {
				System.out.println("请输入您要存的金额");
				double cun=scan.nextDouble();
				atm.deposit(x,cun);
			}
			if(m==2) {
				System.out.println("请输入您取出的金额");
				double qu=scan.nextDouble();
				atm.draw(x,qu);
			}
			if(m==3) {
				System.out.println(x);
				atm.view(x);
			}
			if(m==4) {
				System.out.println("请输入您要转入的银行账号");
				int a=scan.nextInt();
				System.out.println("请输入您取出的金额");
				double zhuan=scan.nextDouble();
				atm.forward(x, zhuan, a);
			}
			if(m==5) {
				System.out.println("请输入您的银行账号");
				x=scan.nextInt();
				System.out.println("请输入用户名");
				y=scan.next();
				System.out.println("请输入密码");
				z=scan.nextInt();
				atm.land(x, y, z);
			}
			if(m==6) {
				System.out.println("ATM机欢迎您");
				break;
			}
		}
		
		
	}
	
}
