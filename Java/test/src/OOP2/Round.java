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
		System.out.println("半径为"+x+"的圆的面积为："+Math.PI*x*x);
	}
	
}
