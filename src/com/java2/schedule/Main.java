package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public Main() {
		try {
			//讀取資料
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String tokens1[] = line.split(",");
			List<String> course1 = new ArrayList<>();
			for (int i = 0; i < tokens1.length; i++) {
				course1.add(tokens1[i]);
			}
			System.out.println(course1);
			
			line = br.readLine();
			String tokens2[] = line.split(",");
			List<String> course2 = new ArrayList<>();
			for (int i = 0; i < tokens2.length; i++) {
				course2.add(tokens2[i]);
			}
			System.out.println(course2);
			
			line = br.readLine();
			String tokens3[] = line.split(",");
			List<String> course3 = new ArrayList<>();
			for (int i = 0; i < tokens3.length; i++) {
				course3.add(tokens3[i]);
			}
			System.out.println(course3);
			
			line = br.readLine();
			String tokens4[] = line.split(",");
			List<String> course4 = new ArrayList<>();
			for (int i = 0; i < tokens4.length; i++) {
				course4.add(tokens4[i]);
			}
			System.out.println(course4);
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

		public Course(List<String> course1, List<String> course2, List<String> course3, List<String> course4) {
			this.course1 = course1;
			this.course2 = course2;
			this.course3 = course3;
			this.course4 = course4;
		}
	}
}
