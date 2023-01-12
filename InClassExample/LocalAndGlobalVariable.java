package InClassExample;

public class LocalAndGlobalVariable {

	static int marks = 80;

	public static void main(String[] args) {

		int tiger = 10;
		System.out.println(tiger);
		
		System.out.println(marks);
		m1();
		
	}
	
	// write a method with name m1 with no input values and no return type
	static void m1(){
		int h1 =32;
		System.out.println(h1);
		System.out.println(marks);
		//System.out.println(course);
	}
	

}
