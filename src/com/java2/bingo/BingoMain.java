package com.java2.bingo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.java2.oo.MazeMain.Maze;

public class BingoMain {
	public BingoMain() {
		try {
			// 建立bingo表格
			FileReader fr = new FileReader("bingo.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int number = Integer.parseInt(line);
			int table =  (int) Math.sqrt(number);
			//System.out.println(number);
			//System.out.println(table);
			Form form = new Form(table,number);
			form.print();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new BingoMain();
	}

	public class Form {
		int table;
		int number;
		public Form(int table,int number) {
			this.table = table;
			this.number = number;
			
		}
		public void print() {
			for(int i =1;i<=number;i++) {
				System.out.println(i);
			}
		}
	}

}
