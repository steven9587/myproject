package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	//丟上來可用try...catch處理或繼續throws
	public static void main(String[] args) throws IOException {
		write();
	}

	// 若簡單則在下方直接用try...catch解決
	// 若困難丟到main方法理處理
	public static void write() throws IOException {
		/*
		 * try { FileOutputStream out = new FileOutputStream("data.txt");
		 * out.write(65); out.write(66); out.write(67); out.flush();
		 * out.close(); } catch (FileNotFoundException e) {
		 * System.out.println("File Not Found! "); ; } catch (IOException e) {
		 * System.out.println("file Output Problem "); } }
		 */
		FileOutputStream out = new FileOutputStream("data.txt");
		out.write(65);
		out.write(66);
		out.write(67);
		out.flush();
		out.close();
	}
}
