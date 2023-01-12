package com.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class PalindromeBuffer {
    public static void main(String[] args) throws IOException {
	String str= " welcome to odin a school to the java full stack program";
	try (FileOutputStream fos = new FileOutputStream("info.txt")) {
		byte b[] = str.getBytes();
		fos.write(b);
	}
	
    }
}
