package InClassExample;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int a=12,b= 12;
		int c = 6;
		int d = 6; 
		int e = 2;
				
		int r1 = addNumber(a,b);
		int r2 = addNumber(c,d);
		int r3 = multiplyNumber(r1,r2);
		double r4 = division(r3,e);
		System.out.println("the Expression result is: "+ r4);
		

	}
	static int addNumber(int num1, int num2) {
		int add = num1 + num2;
		return add;
	}
	static int multiplyNumber(int num1, int num2) {
		int multiply = num1*num2;
		return multiply;
	}
	static double division(int num1, int num2) {
		int div = num1/num2;
		return div;
	}

}
