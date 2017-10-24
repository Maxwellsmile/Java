/*
 * 3写一个Boss类，Boss的属性有姓名和职位，
 * 方法有招聘经理，招聘员工，干工作3项，
 * 该Boss手下管理3个经理，所以需要设计一个Manager经理类，
 * 该经理的属性同Boss一样，方法有招聘员工和干工作两项，
 * 经理手下管理3名员工，所以再创建一个Worker员工类，
 * 员工的属性同上，方法只有干工作1项。
 */

package Object;

public class Boss extends Clerk implements Method {
	
	@Override
	public void recruitwork() {
		System.out.println("由于公司扩张现招聘员工若干名，有意者面谈");	
	}
	public void recruit() {
		System.out.println("由于公司扩张现招聘经理3名，有意者面谈");	
	}

	@Override
	public void work() {
		System.out.println("我是本公司的"+position+" "+name+"检查经理是否按照指示工作是我的工作");
		
	}

	
	
}
