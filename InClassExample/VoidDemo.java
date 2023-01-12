package InClassExample;

public class VoidDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 22;
		int num2 = 33;
		float num3 = 12.23f;
		float num4 = 13.45f;
		double num5 = 12.324;
		double num6 = 21.435;
		addition(num1, num2);
		addition(num3, num4);
		VoidDemo add = new VoidDemo(); //object created
		add.addition(num5, num6);
		

	}

	static void addition(int num1, int num2) {
		System.out.println("integer sum is: " + (num1 + num2));
	}

	static void addition(float n1, float n2) {
		System.out.println("float sum is: " + (n1 + n2));
	}
	void addition(double x, double y) {
		System.out.println("double sum is: "+ (x+y));
	}

}
