package studentdemo.copy;

import java.util.Scanner;
/**
 * 
 * @author zhouyong
 *
 */
public class students2 {

	public static void main(String []args) {
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
				studentManage2.add(s);
				break;
			case 2:
				System.out.println("������Ҫɾ����ѧ��ѧ��");
				int x=scan.nextInt();
				studentManage2.del(x);
				break;
			case 3:						 
				student d = new student();
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
				studentManage2.update(d);
				break;
			case 4:
				studentManage2.query();
				break;
				
			}
		}
	        
		
		
		
	}
}
