package OOP;

import java.util.ArrayList;
import java.util.List;

public class Client
	{
		public static void main(String[] args)
		{
			List<Student> list = new ArrayList<Student>();
			
			Manager manager = new Manager(list);//创建一个管理者
			
			Student s1 = new Student();//无参构造方法创建的学生实例
			
			//通过方法设置s1的属性
			s1.setId(201105);
			s1.setAge(20);
			s1.setScore(100);
			s1.setName("张三");
			
			Student s2 = new Student(201101,21,98,"李四");//通过带参数的构造方法创建实例
			Student s3 = new Student(201108,25,95,"赵六");
			Student s4 = new Student(201110,23,80,"周明");
			Student s5 = new Student(201106,28,78,"李亮");
			
			//放到集合当中
			manager.getList().add(s1);//添加学生
			manager.getList().add(s2);
			manager.getList().add(s3);
			manager.getList().add(s4);
			manager.getList().add(s5);
			
			System.out.println(list);
			
			System.out.println(manager.allScore());
			
			System.out.println(manager.search(201101));//根据学生学号查询学生年龄
			
			manager.search(201101);
			
			manager.remove(201110);//删除学生
			
			manager.update(201101);//修改成绩
			
	}
}

