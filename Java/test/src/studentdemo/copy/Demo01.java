package studentdemo.copy;
/**
 * ֪ʶ�㣺
 *   ���췽��
 *   �������� ��add
 *   ��̬��
 *     ��̬������.������  ����.������
 *     �Ǿ�̬������.������  ����.������
 * @author zhouyong
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		/*
		 * student��Ĺ��췽��
		 */
		student s1 = new student();
		System.out.println(s1.getName()+"   "+s1.getAge());
		student s2 = new student("����",20);
		System.out.println(s2.getName()+"   "+s2.getAge());
		s2.setName("������");
		System.out.println(s2.getName()+"   "+s2.getAge());
		student s3 = new student("", 0, 1, "", 1);
	}
	
}
