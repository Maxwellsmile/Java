//4���һ���������ATM����¼����Ǯ��ȡǮ���鿴��ת�ˡ��˳���¼�ȹ��ܡ�


package Object;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		AtmManage atm=new AtmManage();
		System.out.println("�����������˺�");
		int x=scan.nextInt();
		System.out.println("�������û���");
		String y=scan.next();
		System.out.println("����������");
		int z=scan.nextInt();
		atm.land(x, y, z);
		while(true) {
			System.out.println("��ѡ����Ҫ���еĲ�����1.��Ǯ��2.ȡǮ��3.�鿴��4.ת�ˡ�5.���µ�½��6.�˳���¼");
			int m=scan.nextInt();
			if(m==1) {
				System.out.println("��������Ҫ��Ľ��");
				double cun=scan.nextDouble();
				atm.deposit(x,cun);
			}
			if(m==2) {
				System.out.println("��������ȡ���Ľ��");
				double qu=scan.nextDouble();
				atm.draw(x,qu);
			}
			if(m==3) {
				System.out.println(x);
				atm.view(x);
			}
			if(m==4) {
				System.out.println("��������Ҫת��������˺�");
				int a=scan.nextInt();
				System.out.println("��������ȡ���Ľ��");
				double zhuan=scan.nextDouble();
				atm.forward(x, zhuan, a);
			}
			if(m==5) {
				System.out.println("���������������˺�");
				x=scan.nextInt();
				System.out.println("�������û���");
				y=scan.next();
				System.out.println("����������");
				z=scan.nextInt();
				atm.land(x, y, z);
			}
			if(m==6) {
				System.out.println("ATM����ӭ��");
				break;
			}
		}
		
		
	}
	
}
