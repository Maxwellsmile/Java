/*
 * 3дһ��Boss�࣬Boss��������������ְλ��
 * ��������Ƹ������ƸԱ�����ɹ���3�
 * ��Boss���¹���3������������Ҫ���һ��Manager�����࣬
 * �þ��������ͬBossһ������������ƸԱ���͸ɹ������
 * �������¹���3��Ա���������ٴ���һ��WorkerԱ���࣬
 * Ա��������ͬ�ϣ�����ֻ�иɹ���1�
 */

package Object;

public class Boss extends Clerk implements Method {
	
	@Override
	public void recruitwork() {
		System.out.println("���ڹ�˾��������ƸԱ������������������̸");	
	}
	public void recruit() {
		System.out.println("���ڹ�˾��������Ƹ����3������������̸");	
	}

	@Override
	public void work() {
		System.out.println("���Ǳ���˾��"+position+" "+name+"��龭���Ƿ���ָʾ�������ҵĹ���");
		
	}

	
	
}
