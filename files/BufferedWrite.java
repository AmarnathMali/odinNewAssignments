package files;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fr = new FileWriter("file1.txt");
		BufferedWriter bw = new BufferedWriter (fr);
		
		bw.write("bol bidu ");
		bw.close();
	}


}
