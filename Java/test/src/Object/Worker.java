package Object;

public class Worker extends Clerk implements Method  {
	
	@Override
	public void recruitwork() {
		System.out.println("��û�д���Ȩ��������ְ������ʹ");
	}

	@Override
	public void work() {
		System.out.println("���Ǳ���˾��"+position+" "+name+"�������ҵĹ���");
	}

//	extends(�̳�) clerk implements//(�ӿ�) Method 
	

	
//	
}

