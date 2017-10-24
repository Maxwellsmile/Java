package studentdemo.copy;

import java.util.Arrays;

public class studentManage {
	
	private student students[];
	/*
	 * 构造方法  ： 创建本类对象时调用
	 * 每个类都有一个默认的空构造
	 */
	public studentManage() {
		System.out.println("---------空构造----------");
		students = new student[2];
		students[0] = new student("张三",19,1,"电商",1001);//(String name1,int age1,int classes1,String magor1,int number1) 
		students[1] = new student("李四",20,1,"电商",1002);
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
