//4设计一个程序，完成ATM机登录、存钱、取钱、查看余额、转账、退出登录等功能。


package Object;

public class AtmTest {
	private String name;
	private int password;
	private int number;
	private double money;
	public AtmTest(String name1,int password1,int number1,double money1) {
		name=name1;
		password=password1;
		number=number1;
		money=money1;
	}
	public void setname(String name1) {
		name=name1;
	}
	public void setpassword(int password1) {
		password=password1;
	}
	public void setnumber(int number1) {
		number=number1;
	}
	public String getname() {
		return name;
	}
	public int getpassword() {
		return password;
	}
	public int getnumber() {
		return number;
	}
	public void setmoney(double money1) {
		money=money1;
	}
	public double getmoney() {
		return money;
	}
}
