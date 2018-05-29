package com.java2.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tester {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("ptt.cc", 23);
			InputStream is = socket.getInputStream();
			int data =0;
			for (int i = 0; i < 5000; i++) {
				data = is.read();
				System.out.println((char) data);
			}
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
