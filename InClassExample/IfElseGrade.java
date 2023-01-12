package InClassExample;

import java.util.Scanner;

public class IfElseGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a marks: ");
		int marks = scn.nextInt();
		displayGrade(marks);

	}

	private static void displayGrade(int marks) {
		// TODO Auto-generated method stub
		if(marks > 100) {
			System.out.println("Pleser check input");
			
		}else {
			if(marks > 90) {
				if(marks > 95) {
				    System.out.println("A+ grade");
				    System.out.println("have good sleep...don't read");
				}else {
					System.out.println("A grade");
					System.out.println("still there is room to improve");
				}
			}else if(marks > 80) {
				System.out.println("B grade");
				System.out.println("need more improvement");
				
			}else if(marks > 70) {
				System.out.println("c grade");
				System.out.println("study hard");
				
			}else if(marks > 60) {
				System.out.println("D grade");
				System.out.println("work hard");
			}else {
				System.out.println("fail");
				System.out.println("Sorry bro your fail");
			}
		}
		
	}

}
