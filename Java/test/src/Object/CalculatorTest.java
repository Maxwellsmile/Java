/*
 * 1采用面向对象的思想，设计计算器
 */
package Object;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入第一个数字：");
		cal.num1 = scan.nextInt();
		
		System.out.println("请输入运算符：");
		cal.symbol = scan.next();
		
		System.out.println("请输入第二个数字：");
		cal.num2 = scan.nextInt();
		
		cal.count();
	}
}
