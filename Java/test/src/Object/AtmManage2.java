package Object;

import java.util.ArrayList;

public class AtmManage2 {
	public void land(ArrayList<AtmTest2> list,int z,String x,int y ) {		
		for(AtmTest2 str:list) {
			if(str.getnumber()==z&&str.getname().equals(x) &&str.getpassword()==y ) {
				System.out.println("登陆成功！");
				break;
			}
//			System.out.println("登陆失败，请检查您的信息是否正确！");
		}
	}
	public void deposit(ArrayList<AtmTest2> list,int x,double y ) {
		for(AtmTest2 str:list) {
			if(str.getnumber()==x ) {
				str.setmoney(str.getmoney()+y);
				System.out.println("操作成功！");
				break;
			}
		}
	}
	public void draw(ArrayList<AtmTest2> list,int x,double y ) {
		for(AtmTest2 str:list) {
			if(str.getnumber()==x ) {
				str.setmoney(str.getmoney()-y);
				System.out.println("操作成功！");
				break;
			}
		}
	}
	public void view(ArrayList<AtmTest2> list,int x) {
		for(AtmTest2 str:list) {
			if(str.getnumber()==x ) {				
				System.out.println("您当前余额："+str.getmoney());
				break;
			}
		}
	}
	public void forward(ArrayList<AtmTest2> list,int x,double y,int z) {
		for(AtmTest2 str:list) {
			if(str.getnumber()==x ) {				
				str.setmoney(str.getmoney()-y);
				System.out.println("正在转帐......");
				break;
			}
		}
		for(AtmTest2 str:list) {
			if(str.getnumber()==z ) {	
				str.setmoney(str.getmoney()+y);
				System.out.println("转帐成功！");
				break;
			}
		}
	}
}

