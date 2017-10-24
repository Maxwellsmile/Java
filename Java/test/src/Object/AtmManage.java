//4设计一个程序，完成ATM机登录、存钱、取钱、查看余额、转账、退出登录等功能。


package Object;

public class AtmManage {
	private AtmTest information[];
	public AtmManage() {
		information=new AtmTest[2];
		information[0]= new AtmTest("周用",123456,123456,500.00);
		information[1]= new AtmTest("周周",654321,654321,500.00);
	}
	
	public void land(int z,String x,int y ) {		
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==z&&information[i].getname().equals(x) &&information[i].getpassword()==y ) {
				System.out.println("登陆成功！");
				break;
			}
//			System.out.println("登陆失败，请检查您的信息是否正确！");
		}
	}
	public void deposit(int x,double y ) {
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==x ) {
				information[i].setmoney(information[i].getmoney()+y);
				System.out.println("操作成功！");
				break;
			}
		}
	}
	public void draw(int x,double y ) {
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==x ) {
				information[i].setmoney(information[i].getmoney()-y);
				System.out.println("操作成功！");
				break;
			}
		}
	}
	public void view(int x) {
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==x ) {				
				System.out.println("您当前余额："+information[i].getmoney());
				break;
			}
		}
	}
	public void forward(int x,double y,int z) {
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==x ) {				
				information[i].setmoney(information[i].getmoney()-y);
				System.out.println("正在转帐......");
				break;
			}
		}
		for(int i=0;i<information.length;i++) {
			if(information[i].getnumber()==z ) {	
				information[i].setmoney(information[i].getmoney()+y);
				System.out.println(information[i].getmoney());
				System.out.println("转帐成功！");
				break;
			}
		}
	}
}
