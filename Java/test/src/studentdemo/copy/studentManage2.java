package studentdemo.copy;

import java.util.Arrays;

public class studentManage2 {
	
	private static student students[];
	
	//静态块来初始化
	static {
		students = new student[2];
		students[0] = new student("张三",19,1,"电商",1001);//(String name1,int age1,int classes1,String magor1,int number1) 
		students[1] = new student("李四",20,1,"电商",1002);
	}
	
	 //添加学生
	 public static void add(student s) {
		 students=Arrays.copyOf(students, students.length+1);//s1 s2 null
		 students[students.length-1]=s;
		 System.out.println("添加成功");
	 }
	 //删除学生
	 public static void del(int x) {
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
	 public static void update(student s) {
		 for(int i=0;i<students.length;i++) {
				if(students[i].getNumber()==s.getNumber()) {
					students[i]=s;
					System.out.println("修改成功");
					break;
				}
			}
	 }
	 
	 //查询学生
	 public static void query() {
		 	System.out.println("学号  "+"姓名  "+"年龄  "+"专业  "+"班级");
			for(int i=0;i<students.length;i++) {
				student s = students[i];
				System.out.println(s.getNumber()+" "+s.getName()+" "+s.getAge()+" "+s.getMagor()+" "+s.getClasses());
				
			}
	 }
	 
}
