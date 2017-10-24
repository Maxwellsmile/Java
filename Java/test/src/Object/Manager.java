package Object;

public class Manager extends Clerk implements Method {
	
	@Override
	public void recruitwork() {
		System.out.println("由于公司扩张现招聘员工若干名，有意者面谈");
	}

	@Override
	public void work() {
		System.out.println("我是本公司的"+position+" "+name+"检查保洁是否合格是我的工作");
	}

}
