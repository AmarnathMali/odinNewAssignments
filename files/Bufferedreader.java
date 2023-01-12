package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {
 
	public static void main(String[] args) throws IOException {
		//String str = " i am grateful for what ever i had";
		
		System.out.println("enter a num: ");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		int n = Integer.parseInt(bf.readLine());
		System.out.println(n);
	}
}
