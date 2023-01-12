package week5exceptionHandling;

import java.util.Scanner;

public class UserCredential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String userId = "Java";
		//String password = "sql";
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter user name:");
		String userName = scn.next();
		System.out.println("enter password");
		String pass = scn.next();
		
		if(userName.equals("Java") && pass.equals("sql")) {
			System.out.println("login successfully");
		}
		else {
			throw new InvalidUserCredentialException();
		}
		

	}

}
