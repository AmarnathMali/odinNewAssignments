package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "C:/Users/admin/OneDrive/Desktop/odinSchool/Odin_CoreJava_InClass/Demo/java.txt";
		File fileObj = new File(location);
		FileReader fileReaderObj;
		try {
			fileReaderObj = new FileReader(fileObj);
			BufferedReader bufferObj = new BufferedReader(fileReaderObj);
			String line ="";
			while((line =bufferObj.readLine()) != null){
				System.out.println(line);
			}
			//System.out.println(bufferObj.readLine());
			bufferObj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
