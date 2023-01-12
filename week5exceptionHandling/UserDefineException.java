package week5exceptionHandling;

import java.util.Scanner;

public class UserDefineException {

	public static void main(String[] args) throws InsufficientBalanceException  {
		// TODO Auto-generated method stub
		int availableBalance = 1000;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter amount to withdrawal: ");
		int amount = scn.nextInt();
		scn.close();
		if(amount > availableBalance) {
			throw new InsufficientBalanceException("No available balance found");
		}
	}

}
