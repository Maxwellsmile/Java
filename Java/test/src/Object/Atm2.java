//4���һ���������ATM����¼����Ǯ��ȡǮ���鿴��ת�ˡ��˳���¼�ȹ��ܡ�


package Object;

import java.util.ArrayList;
import java.util.Scanner;

public class Atm2 {
	public static void main(String[] args) {
		ArrayList<AtmTest2> list=new ArrayList();
		AtmTest2 s1=new AtmTest2("����", 123456, 654321, 1000);
		//String name1,int password1,int number1,double money1
		AtmTest2 s2=new AtmTest2("����", 654321, 123456, 10000);
		list.add(s1);
		list.add(s2);
		
		Scanner scan=new Scanner(System.in);
		AtmManage2 atm=new AtmManage2();
		System.out.println("�������������п��˺�");
		int x=scan.nextInt();
		System.out.println("�����������û���");
		String y=scan.next();
		System.out.println("��������������");
		int z=scan.nextInt();
		atm.land(list, x, y, z);
		while(true) {
			System.out.println("��ѡ����������Ҫ���еĲ�����1.��Ǯ��2.ȡǮ��3.�鿴��4.ת�ˡ�5.���µ�½��6.�˳���¼");
			int m=scan.nextInt();
			if(m==1) {
				System.out.println("��������Ҫ���Ǯ��");
				double cun=scan.nextDouble();
				atm.deposit(list,x,cun);
			}
			if(m==2) {
				System.out.println("��������ȡ����Ǯ��");
				double qu=scan.nextDouble();
				atm.draw(list,x,qu);
			}
			if(m==3) {
				System.out.println(x);
				atm.view(list,x);
			}
			if(m==4) {
				System.out.println("��������Ҫת������п��˺�");
				int a=scan.nextInt();
				System.out.println("��������ȡ����Ǯ��");
				double zhuan=scan.nextDouble();
				atm.forward(list,x, zhuan, a);
			}
			if(m==5) {
				System.out.println("�������������п��˺�");
				x=scan.nextInt();
				System.out.println("�����������û���");
				y=scan.next();
				System.out.println("��������������");
				z=scan.nextInt();
				atm.land(list,x, y, z);
			}
			if(m==6) {
				System.out.println("ATM����ӭ��");
				break;
			}
		}
		
		
	}

	
}

