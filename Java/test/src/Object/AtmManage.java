//4���һ���������ATM����¼����Ǯ��ȡǮ���鿴��ת�ˡ��˳���¼�ȹ��ܡ�


package Object;

public class AtmManage {
	private AtmTest information[];
	public AtmManage() {
		information=new AtmTest[2];
		information[0]= new AtmTest("����",123456,123456,500.00);
		information[1]= new AtmTest("����",654321,654321,500.00);
	}
	
	public void land(int z,String x,int y ) {		
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==z&&information[i].getname().equals(x) &&information[i].getpassword()==y ) {
				System.out.println("��½�ɹ���");
				break;
			}
//			System.out.println("��½ʧ�ܣ�����������Ϣ�Ƿ���ȷ��");
		}
	}
	public void deposit(int x,double y ) {
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==x ) {
				information[i].setmoney(information[i].getmoney()+y);
				System.out.println("�����ɹ���");
				break;
			}
		}
	}
	public void draw(int x,double y ) {
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==x ) {
				information[i].setmoney(information[i].getmoney()-y);
				System.out.println("�����ɹ���");
				break;
			}
		}
	}
	public void view(int x) {
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==x ) {				
				System.out.println("����ǰ��"+information[i].getmoney());
				break;
			}
		}
	}
	public void forward(int x,double y,int z) {
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==x ) {				
				information[i].setmoney(information[i].getmoney()-y);
				System.out.println("����ת��......");
				break;
			}
		}
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==z ) {	
				information[i].setmoney(information[i].getmoney()+y);
				System.out.println(information[i].getmoney());
				System.out.println("ת�ʳɹ���");
				break;
			}
		}
	}
}
