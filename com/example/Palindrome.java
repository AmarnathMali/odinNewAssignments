package com.example;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		String str1 = "";
		for(int i =  str.length()-1;i >= 0;i--) {
			str1 += str.charAt(i);
		}
		if(str.equals(str1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}

