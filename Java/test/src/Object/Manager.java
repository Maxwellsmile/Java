package Object;

public class Manager extends Clerk implements Method {
	
	@Override
	public void recruitwork() {
		System.out.println("���ڹ�˾��������ƸԱ������������������̸");
	}

	@Override
	public void work() {
		System.out.println("���Ǳ���˾��"+position+" "+name+"��鱣���Ƿ�ϸ����ҵĹ���");
	}

}
