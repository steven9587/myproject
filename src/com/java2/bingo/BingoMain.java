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
			form.bingo();
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
		List<Integer> numbers = new ArrayList<>();

		public Form(int table, int number, List<Integer> answers) {
			this.table = table;
			this.number = number;
			this.answers = answers;
		}

		public void print() {
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
			int rowbingo ;
			int row = 0;
			int columnbingo ;
			int column = 0;
			int slashbingo ;
			int slash = 0;
			int[][] finaltable = new int[table][table];
			
			//判斷橫的
			for (int i = 0; i < table; i++) {
				rowbingo = 0;
				for (int j = 0; j < table; j++) {
					for (int p = 0; p < answers.size(); p++) {
						if (finaltable[i][j] == answers.get(p)) {
							rowbingo+=1;
						}
					}
				}
				if(rowbingo==5) {
					row+=1;
				}
			}
			System.out.println("橫線"+row+"條");
			//判斷直的
			for (int i = 0; i < table; i++) {
				columnbingo = 0;
				for (int j = 0; j < table; j++) {
					for (int p = 0; p < answers.size(); p++) {
						if (finaltable[j][i] == answers.get(p)) {
							columnbingo+=1;
						}
					}
				}
				if(columnbingo==5) {
					column+=1;
				}
			}
			System.out.println("直線"+column+"條");
			//判斷斜線的(左上到右下)
			slashbingo = 0;
			for (int i = 0; i < table; i++) {
					for (int p = 0; p < answers.size(); p++) {
						if (finaltable[i][i] == answers.get(p)) {
							slashbingo+=1;
						}
					}
				if(slashbingo==5) {
					slash+=1;
				}
			}
			//判斷斜線的(右上到左下)
			slashbingo = 0;
			for (int i = 0; i < table; i++) {
					for (int p = 0; p < answers.size(); p++) {
						if (finaltable[i][table-(i+1)] == answers.get(p)) {
							slashbingo+=1;
						}
					}
				if(slashbingo==5) {
					slash+=1;
				}
			}
			System.out.println("斜線"+slash+"條");
		}
	}
}
