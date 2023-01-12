package week5exceptionHandling;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of main method");
		String location = "C:/Users/admin/OneDrive/Desktop/odinSchool/Odin_CoreJava_InClass/Demo/Java.txt";
		File fileobj = new File(location);
		try {
			fileobj.createNewFile();
			System.out.println("file created sussesfully");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
		}
		  System.out.println("ending of main method");

	}

}
