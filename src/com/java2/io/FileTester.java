package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.write(66);
			out.write(67);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found! ");
			;
		} catch (IOException e) {
			System.out.println("file Output Problem ");
		}
	}

}