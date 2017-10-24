package Object;

public class Worker extends Clerk implements Method  {
	
	@Override
	public void recruitwork() {
		System.out.println("您没有此项权利，请升职后再行使");
	}

	@Override
	public void work() {
		System.out.println("我是本公司的"+position+" "+name+"保洁是我的工作");
	}

//	extends(继承) clerk implements//(接口) Method 
	

	
//	
}

