package Object;

public class AtmTest2 {
	
	private String name;
	private int password;
	private int number;
	private double money;
	public AtmTest2(String name1,int password1,int number1,double money1) {
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

