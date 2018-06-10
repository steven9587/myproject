package com.java2.bingo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoMain {
	public BingoMain() {
		try {
			// 建立bingo表格
			FileReader fr = new FileReader("bingo.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int number = Integer.parseInt(line);
			int table = (int) Math.sqrt(number);
			// System.out.println(number);
			// System.out.println(table);
			Form form = new Form(table, number);
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

		public Form(int table, int number) {
			this.table = table;
			this.number = number;

		}

		public void print() {
			List<Integer> numbers = new ArrayList<>();
			for (int i = 1; i <= number; i++) {
				numbers.add(i);
				Collections.shuffle(numbers);
			}
			for (int p = 0; p < numbers.size(); p++) {
				if (numbers.get(p) > 9) {
					System.out.print(numbers.get(p) + " ");
				} else {
					System.out.print(" " + numbers.get(p) + " ");
				}
				if (p % 5 == 4) {
					System.out.println();
				}
			}
		}

	}
}
