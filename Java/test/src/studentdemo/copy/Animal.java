package studentdemo.copy;
/**
 * ���������Ժͷ���������ʱ��
 * @author zhouyong
 *
 */
public class Animal {

	//��̬��Ա����
	static String name1 = "��̬��Ա����";
	//�Ǿ�̬��Ա����
	String name2 = "�Ǿ�̬��Ա����";
	
	//��̬��
	static{
		System.out.println(name1);
		System.out.println("��̬��");
	}
	
	//�����
	{
		System.out.println(name2);
		System.out.println("�����");
	}
	
	//���췽��
	public Animal() {
		System.out.println("���췽��");
	}
	
}
