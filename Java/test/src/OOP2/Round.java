package OOP2;

public class Round {
	double x;

	public Round(double x) {
		super();
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public void area() {
		System.out.println("�뾶Ϊ"+x+"��Բ�����Ϊ��"+Math.PI*x*x);
	}
	
}
