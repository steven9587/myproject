package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public Main() {
		try {
			// 讀取資料(第一行)
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String tokens1[] = line.split(",");
			List<String> course1 = new ArrayList<>();
			for (int i = 0; i < tokens1.length; i++) {
				course1.add(tokens1[i]);
			}
			// System.out.println(course1);
			// 讀取資料(第二行)
			line = br.readLine();
			String tokens2[] = line.split(",");
			List<String> course2 = new ArrayList<>();
			for (int i = 0; i < tokens2.length; i++) {
				course2.add(tokens2[i]);
			}
			// System.out.println(course2);
			// 讀取資料(第三行)
			line = br.readLine();
			String tokens3[] = line.split(",");
			List<String> course3 = new ArrayList<>();
			for (int i = 0; i < tokens3.length; i++) {
				course3.add(tokens3[i]);
			}
			// System.out.println(course3);
			// 讀取資料(第四行)
			line = br.readLine();
			String tokens4[] = line.split(",");
			List<String> course4 = new ArrayList<>();
			for (int i = 0; i < tokens4.length; i++) {
				course4.add(tokens4[i]);
			}
			// System.out.println(course4);
			// 輸入資料
			System.out.print("請輸入星期(1-7):");
			Scanner scanner = new Scanner(System.in);
			String entry = scanner.nextLine();
			int day = Integer.parseInt(entry);
			System.out.print("請輸入時(0-24):");
			entry = scanner.nextLine();
			int time = Integer.parseInt(entry);
			Course course = new Course(course1, course2, course3, course4, day, time);
			course.Judgment();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Main();

	}

	public class Course {
		List<String> course1;
		List<String> course2;
		List<String> course3;
		List<String> course4;
		int day;
		int time;

		public Course(List<String> course1, List<String> course2, List<String> course3, List<String> course4, int day,
				int time) {
			this.course1 = course1;
			this.course2 = course2;
			this.course3 = course3;
			this.course4 = course4;
			this.day = day;
			this.time = time;
		}

		public void Judgment() {
			// 判斷13~16(星期四)
			if (time > Integer.parseInt(course1.get(3))
					&& (time < Integer.parseInt(course1.get(3)) + Integer.parseInt((course1.get(4))))
					&& (day == Integer.parseInt(course1.get(2)))) {
				System.out.println("【有課：  " + course1.get(0) + " " + course1.get(1) + " " + "到" + " "
						+ (course1.get(3) + course1.get(4)) + "】");
			} else {
				if (time > Integer.parseInt(course2.get(3))
						&& (time < Integer.parseInt(course2.get(3)) + Integer.parseInt((course2.get(4))))
						&& (day == Integer.parseInt(course2.get(2)))) {
					System.out.println("【有課：  " + course2.get(0) + " " + course2.get(1) + " " + "到" + " "
							+ (course2.get(3) + course2.get(4)) + "】");
				} else {
					if (time > Integer.parseInt(course3.get(3))
							&& (time < Integer.parseInt(course3.get(3)) + Integer.parseInt((course3.get(4))))
							&& (day == Integer.parseInt(course3.get(2)))) {
						System.out.println("【有課：  " + course3.get(0) + " " + course3.get(1) + " " + "到" + " "
								+ (course3.get(3) + course3.get(4)) + "】");
					} else {
						if (time > Integer.parseInt(course4.get(3))
								&& (time < Integer.parseInt(course4.get(3)) + Integer.parseInt((course4.get(4))))
								&& (day == Integer.parseInt(course4.get(2)))) {
							System.out.println("【有課：  " + course4.get(0) + " " + course4.get(1) + " " + "到" + " "
									+ (course4.get(3) + course4.get(4)) + "】");
						} else {
							System.out.println("【有空檔】");
						}
					}
				}
			}

		}
	}
}