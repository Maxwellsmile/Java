package studentdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class students {
	public static void main(String []args) {
		ArrayList<student> list=new ArrayList<student>();
		student a1=new student("����", 24, 2, "���", 1001);
		student a2=new student("����", 26, 1, "���", 1002);
		student a3=new student("����", 23, 2, "���", 1003);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Scanner scan = new Scanner(System.in); 	
		int i=0;
		while(true){
		    System.out.println("�����������������飺1.���� 2.ɾ�� 3.�޸� 4.��ѯ");
		    i=scan.nextInt();
			switch(i) {
			case 1:		 
				student s = new student();
				System.out.println("������ѧ��ѧ��");
				s.setNumber(scan.nextInt());
				System.out.println("������ѧ������");
				s.setName(scan.next());
				System.out.println("������ѧ������");
				s.setAge(scan.nextInt());
				System.out.println("������ѧ��רҵ");
				s.setMagor(scan.next());
				System.out.println("������ѧ���༶");
				s.setClasses(scan.nextInt());
				list.add(s);
				break;
			case 2:
				System.out.println("������Ҫɾ����ѧ�����");
				int x=scan.nextInt();
				list.remove(x);
				break;
			case 3:						 
				student d = new student();
				System.out.println("�������޸�ѧ�������");
				int j=scan.nextInt();
				System.out.println("������Ҫ�޸�ѧ����ѧ��");
				d.setNumber(scan.nextInt());
				System.out.println("�������޸�ѧ������");
				d.setName(scan.next());
				System.out.println("�������޸�ѧ������");
				d.setAge(scan.nextInt());
				System.out.println("�������޸�ѧ��רҵ");
				d.setMagor(scan.next());
				System.out.println("�������޸�ѧ���༶");
				d.setClasses(scan.nextInt());
				list.set(j,d);
				break;
			case 4:
//				System.out.println("-----��ѯ------");
				for(int k=0;k<list.size();k++) {
					System.out.println(list.get(k));
				}
				break;	
			}
		}
	        
		
		
		
	}
}
