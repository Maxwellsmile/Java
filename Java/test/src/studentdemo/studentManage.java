package studentdemo;

import java.util.Arrays;

public class studentManage {
	
	student students[];
	 public student[] init() {
		 students = new student[2];
		 student s1 = new student();
		 s1.setNumber(1001);
		 s1.setName("����");
		 s1.setAge(19);
		 s1.setMagor("����");
		 s1.setClasses(1);
		 students[0]=s1;
		 student s2 = new student();
		 s2.setNumber(1002);
		 s2.setName("����");
		 s2.setAge(20);
		 s2.setMagor("����");
		 s2.setClasses(1);
		 students[1]=s2; 
		 return students;
	 }
	 //���ѧ��
	 public void add(student s) {
		 students=Arrays.copyOf(students, students.length+1);//s1 s2 null
		 students[students.length-1]=s;
		 System.out.println("��ӳɹ�");
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
