/*
 * 1������������˼�룬��Ƽ�����
 */
package Object;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������һ�����֣�");
		cal.num1 = scan.nextInt();
		
		System.out.println("�������������");
		cal.symbol = scan.next();
		
		System.out.println("������ڶ������֣�");
		cal.num2 = scan.nextInt();
		
		cal.count();
	}
}
