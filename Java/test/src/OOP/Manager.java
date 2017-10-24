package OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
	
public class Manager
	{
		private List<Student> list;
		
		public Manager(List<Student> list)
		{
			this.list = list;
		}
		
		public List<Student> getList()
		{
			return list;
		}
		public void setList(List<Student> list)
		{
			this.list = list;
		}
		
		//���ѧ��
		public void add(Student s)
		{
			list.add(s);
		}
		
		//����ѧ��ѧ�ŷ���ѧ������
		public int search(int id)
		{
			for(Iterator<Student> iter = list.iterator(); iter.hasNext();)
			{
				Student s = iter.next();
				
				if(s.getId() == id)
				{
					return s.getAge();
				}
			}
			return -1;
		}
		
		//ɾ��ѧ��
		public void remove(int id)
		{
			for(Iterator<Student> iter = list.iterator(); iter.hasNext();)
			{
				Student s = iter.next();
				
				if(s.getId() == id)
				{
					list.remove(s);
				}
			}
		}
		
		//�����ܳɼ�
		public int allScore()
		{
			int score = 0;
			int temp = 0;
			
			for(Iterator<Student> iter = list.iterator(); iter.hasNext();)
			{
				Student s = iter.next();
				
				temp = s.getScore();
				
				score += temp;
			}
			
			return score;
		}
		
		//�޸ĳɼ�
		public void update(int id)
		{
			for(Iterator<Student> iter = list.iterator(); iter.hasNext();)
			{
				Student s = iter.next();
				
				if(s.getId() == id)
				{
					s.setScore(s.getScore() + 10);
				}
			}
		}
}
	