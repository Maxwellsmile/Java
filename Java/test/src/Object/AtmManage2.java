package Object;

import java.util.ArrayList;

public class AtmManage2 {
	public void land(ArrayList<AtmTest2> list,int z,String x,int y ) {		
		for(AtmTest2 str:list) {
			if(str.getnumber()==z&&str.getname().equals(x) &&str.getpassword()==y ) {
				System.out.println("��½�ɹ���");
				break;
			}
//			System.out.println("��½ʧ�ܣ�����������Ϣ�Ƿ���ȷ��");
		}
	}
	public void deposit(ArrayList<AtmTest2> list,int x,double y ) {
		for(AtmTest2 str:list) {
			if(str.getnumber()==x ) {
				str.setmoney(str.getmoney()+y);
				System.out.println("�����ɹ���");
				break;
			}
		}
	}
	public void draw(ArrayList<AtmTest2> list,int x,double y ) {
		for(AtmTest2 str:list) {
			if(str.getnumber()==x ) {
				str.setmoney(str.getmoney()-y);
				System.out.println("�����ɹ���");
				break;
			}
		}
	}
	public void view(ArrayList<AtmTest2> list,int x) {
		for(AtmTest2 str:list) {
			if(str.getnumber()==x ) {				
				System.out.println("����ǰ��"+str.getmoney());
				break;
			}
		}
	}
	public void forward(ArrayList<AtmTest2> list,int x,double y,int z) {
		for(AtmTest2 str:list) {
			if(str.getnumber()==x ) {				
				str.setmoney(str.getmoney()-y);
				System.out.println("����ת��......");
				break;
			}
		}
		for(AtmTest2 str:list) {
			if(str.getnumber()==z ) {	
				str.setmoney(str.getmoney()+y);
				System.out.println("ת�ʳɹ���");
				break;
			}
		}
	}
}

