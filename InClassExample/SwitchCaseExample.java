package InClassExample;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started:-");
		Scanner scn = new Scanner(System.in);
		System.out.println("enter what you want to be know:");
		System.out.println("HTML SQL JAVA");
		String course = scn.next();
		displayCourseInfo(course);
		System.out.println("method ended:-");
		

	}
	static void displayCourseInfo(String course) {
		switch (course) {
		    case "HTML":
		    	System.out.println("html full form is Hyper Text Markup Language");
		    	System.out.println("it is used to design web page");
		    	break;
		    case "SQL":
		    	System.out.println("it is structured query language");
		    	System.out.println("it is used to manipulte data in a database");
		    	break;
		    case "JAVA":
		    	System.out.println("java is a programming language");
		    	System.out.println("java is used to develop android application");
		    	break;
		    default:
		    	System.out.println("your choice is so bad");
		    	break;
		}
			
	}

}
