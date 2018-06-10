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
			line = br.readLine();
			// System.out.println(line);
			String tokens[] = line.split(",");
			List<Integer> answers = new ArrayList<>();
			for (int i = 0; i <= tokens.length - 1; i++) {
				int answer = Integer.parseInt(tokens[i]);
				answers.add(answer);
			}
			Form form = new Form(table, number, answers);
			form.print();
			// System.out.println(answers);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new BingoMain();
	}

	public class Form {
		int table;
		int number;
		List<Integer> answers;

		public Form(int table, int number, List<Integer> answers) {
			this.table = table;
			this.number = number;
			this.answers = answers;
		}

		public void print() {
			List<Integer> numbers = new ArrayList<>();
			for (int i = 1; i <= number; i++) {
				numbers.add(i);
			}
			Collections.shuffle(numbers);
			int[][] finaltable = new int[table][table];
			for (int i = 0; i < table; i++) {
				for (int j = 0; j < table; j++) {
					finaltable[i][j] = numbers.get(i * table + j);
					if (finaltable[i][j] > 9) {
						System.out.print(finaltable[i][j] + " ");
					} else {
						System.out.print(" " + finaltable[i][j] + " ");
					}
				}
				System.out.println();
			}

			/*
			 * 用list方法印出 for (int p = 0; p < numbers.size(); p++) { if (numbers.get(p) > 9)
			 * {
			 * 
			 * System.out.print(numbers.get(p) + " "); } else { System.out.print(" " +
			 * numbers.get(p) + " "); } if (p % 5 == 4) { System.out.println(); } }
			 */
		}

		public void bingo() {

		}
	}
}
