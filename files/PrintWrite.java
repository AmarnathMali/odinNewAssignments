package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "C:/Users/admin/OneDrive/Desktop/odinSchool/Odin_CoreJava_InClass/Demo/java.txt";
		File fileObj = new File(location);
		try {
			PrintWriter priObj = new PrintWriter(fileObj);
			
			priObj.println("amar");
			priObj.println(90);
			priObj.println(33.3);
			priObj.println("a");
			
			priObj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
