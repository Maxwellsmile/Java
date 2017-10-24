package studentdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class students {
	public static void main(String []args) {
		ArrayList<student> list=new ArrayList<student>();
		student a1=new student("张三", 24, 2, "会计", 1001);
		student a2=new student("李四", 26, 1, "会计", 1002);
		student a3=new student("王五", 23, 2, "会计", 1003);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Scanner scan = new Scanner(System.in); 	
		int i=0;
		while(true){
		    System.out.println("请输入您想做的事情：1.增加 2.删除 3.修改 4.查询");
		    i=scan.nextInt();
			switch(i) {
			case 1:		 
				student s = new student();
				System.out.println("请输入学生学号");
				s.setNumber(scan.nextInt());
				System.out.println("请输入学生姓名");
				s.setName(scan.next());
				System.out.println("请输入学生年龄");
				s.setAge(scan.nextInt());
				System.out.println("请输入学生专业");
				s.setMagor(scan.next());
				System.out.println("请输入学生班级");
				s.setClasses(scan.nextInt());
				list.add(s);
				break;
			case 2:
				System.out.println("请输入要删除的学生序号");
				int x=scan.nextInt();
				list.remove(x);
				break;
			case 3:						 
				student d = new student();
				System.out.println("请输入修改学生的序号");
				int j=scan.nextInt();
				System.out.println("请输入要修改学生的学号");
				d.setNumber(scan.nextInt());
				System.out.println("请输入修改学生姓名");
				d.setName(scan.next());
				System.out.println("请输入修改学生年龄");
				d.setAge(scan.nextInt());
				System.out.println("请输入修改学生专业");
				d.setMagor(scan.next());
				System.out.println("请输入修改学生班级");
				d.setClasses(scan.nextInt());
				list.set(j,d);
				break;
			case 4:
//				System.out.println("-----查询------");
				for(int k=0;k<list.size();k++) {
					System.out.println(list.get(k));
				}
				break;	
			}
		}
	        
		
		
		
	}
}
