package studentdemo.copy;

import java.util.Arrays;

public class studentManage {
	
	private student students[];
	/*
	 * ���췽��  �� �����������ʱ����
	 * ÿ���඼��һ��Ĭ�ϵĿչ���
	 */
	public studentManage() {
		System.out.println("---------�չ���----------");
		students = new student[2];
		students[0] = new student("����",19,1,"����",1001);//(String name1,int age1,int classes1,String magor1,int number1) 
		students[1] = new student("����",20,1,"����",1002);
	}
	
	 //����ѧ��
	 public void add(student s) {
		 students=Arrays.copyOf(students, students.length+1);//s1 s2 null
		 students[students.length-1]=s;
		 System.out.println("���ӳɹ�");
	 }
	 //ɾ��ѧ��
	 public void del(int x) {
		 for(int i=0;i<students.length;i++) {
				if(students[i].getNumber()==x) {
					students[i-1]= students[students.length-1];
					break;
				}
				students=Arrays.copyOf(students, students.length-1);
				System.out.println("ɾ���ɹ�");
		 }
	 }
	 
	 //�޸�ѧ��
	 public void update(student s) {
		 for(int i=0;i<students.length;i++) {
				if(students[i].getNumber()==s.getNumber()) {
					students[i]=s;
					System.out.println("�޸ĳɹ�");
					break;
				}
			}
	 }
	 
	 //��ѯѧ��
	 public void query() {
		 	System.out.println("ѧ��  "+"����  "+"����  "+"רҵ  "+"�༶");
			for(int i=0;i<students.length;i++) {
				student s = students[i];
				System.out.println(s.getNumber()+" "+s.getName()+" "+s.getAge()+" "+s.getMagor()+" "+s.getClasses());
				
			}
	 }
	 
}