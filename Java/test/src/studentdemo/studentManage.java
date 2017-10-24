package studentdemo;

import java.util.Arrays;

public class studentManage {
	
	student students[];
	 public student[] init() {
		 students = new student[2];
		 student s1 = new student();
		 s1.setNumber(1001);
		 s1.setName("张三");
		 s1.setAge(19);
		 s1.setMagor("电商");
		 s1.setClasses(1);
		 students[0]=s1;
		 student s2 = new student();
		 s2.setNumber(1002);
		 s2.setName("李四");
		 s2.setAge(20);
		 s2.setMagor("电商");
		 s2.setClasses(1);
		 students[1]=s2; 
		 return students;
	 }
	 //添加学生
	 public void add(student s) {
		 students=Arrays.copyOf(students, students.length+1);//s1 s2 null
		 students[students.length-1]=s;
		 System.out.println("添加成功");
	 }
	 //删除学生
	 public void del(int x) {
		 for(int i=0;i<students.length;i++) {
				if(students[i].getNumber()==x) {
					students[i-1]= students[students.length-1];
					break;
				}
				students=Arrays.copyOf(students, students.length-1);
				System.out.println("删除成功");
		 }
	 }
	 
	 //修改学生
	 public void update(student s) {
		 for(int i=0;i<students.length;i++) {
				if(students[i].getNumber()==s.getNumber()) {
					students[i]=s;
					System.out.println("修改成功");
					break;
				}
			}
	 }
	 
	 //查询学生
	 public void query() {
		 	System.out.println("学号  "+"姓名  "+"年龄  "+"专业  "+"班级");
			for(int i=0;i<students.length;i++) {
				student s = students[i];
				System.out.println(s.getNumber()+" "+s.getName()+" "+s.getAge()+" "+s.getMagor()+" "+s.getClasses());
				
			}
	 }
	 
}
