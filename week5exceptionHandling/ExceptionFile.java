package week5exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ExceptionFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("testfilet.txt");

		Date d = new Date();

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			fw.write(e.toString() + "  " + d);
		}
		fw.close();
	}

}
