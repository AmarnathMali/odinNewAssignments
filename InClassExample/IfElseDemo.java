package InClassExample;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method start");
		displayDesiganation(12);
		System.out.println("end of main method");

	}
	static void displayDesiganation(int experience) {
		if(experience <= 4) {
			System.out.println("junior level software engineer");
		}
		else if(experience <= 8) {
			System.out.println("software enginner");
		}
		else if(experience <= 12) {
			System.out.println("senior level software engineer");
		}
		else {
			System.out.println("company manger");
		}
	}

}
