package OOP;

import java.util.ArrayList;
import java.util.List;

public class Client
	{
		public static void main(String[] args)
		{
			List<Student> list = new ArrayList<Student>();
			
			Manager manager = new Manager(list);//����һ��������
			
			Student s1 = new Student();//�޲ι��췽��������ѧ��ʵ��
			
			//ͨ����������s1������
			s1.setId(201105);
			s1.setAge(20);
			s1.setScore(100);
			s1.setName("����");
			
			Student s2 = new Student(201101,21,98,"����");//ͨ���������Ĺ��췽������ʵ��
			Student s3 = new Student(201108,25,95,"����");
			Student s4 = new Student(201110,23,80,"����");
			Student s5 = new Student(201106,28,78,"����");
			
			//�ŵ����ϵ���
			manager.getList().add(s1);//���ѧ��
			manager.getList().add(s2);
			manager.getList().add(s3);
			manager.getList().add(s4);
			manager.getList().add(s5);
			
			System.out.println(list);
			
			System.out.println(manager.allScore());
			
			System.out.println(manager.search(201101));//����ѧ��ѧ�Ų�ѯѧ������
			
			manager.search(201101);
			
			manager.remove(201110);//ɾ��ѧ��
			
			manager.update(201101);//�޸ĳɼ�
			
	}
}

