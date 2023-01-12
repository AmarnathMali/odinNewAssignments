package week5exceptionHandling;

import java.io.File;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "C:/Users/admin/OneDrive/Desktop/odinSchool/Odin_CoreJava_InClass/Demo/Mava.txt";
		ThrowsDemo obj = new ThrowsDemo();
		try {
			obj.create(location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void create(String location) throws IOException {
		File fileObj = new File(location);
		fileObj.createNewFile();
		System.out.println("file created succesfully");
		
	}

}
