/*
 * 1������������˼�룬��Ƽ�����
 */
package Object;

public class Calculator {
	 int num1;
	 int num2;
	 String symbol;
	 public void count(){
		 int num3;
		 if(symbol.equals("+")) {
			 num3 = num1+num2;
			 System.out.println("��������ǣ�"+ num3);
		 }else if(symbol.equals("-")) {
			 num3 = num1-num2;
			 System.out.println("��������ǣ�"+ num3);
		 }else if(symbol.equals("*")) {
			 num3 = num1*num2;
			 System.out.println("��������ǣ�"+ num3);	 
		 }else if(symbol.equals("/")) {
			 if(num2!=0) {
				 num3 = num1/num2;
				 System.out.println("��������ǣ�"+ num3);
			 }else {
				 System.out.println("����������Ϊ0!");
			 }
		 }else {
			 System.out.println("������ķ�������");
		 }

	 }
}
