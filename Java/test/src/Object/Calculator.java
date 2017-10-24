/*
 * 1采用面向对象的思想，设计计算器
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
			 System.out.println("两数相加是："+ num3);
		 }else if(symbol.equals("-")) {
			 num3 = num1-num2;
			 System.out.println("两数相减是："+ num3);
		 }else if(symbol.equals("*")) {
			 num3 = num1*num2;
			 System.out.println("两数相乘是："+ num3);	 
		 }else if(symbol.equals("/")) {
			 if(num2!=0) {
				 num3 = num1/num2;
				 System.out.println("两数相除是："+ num3);
			 }else {
				 System.out.println("被除数不能为0!");
			 }
		 }else {
			 System.out.println("您输入的符号有误！");
		 }

	 }
}
