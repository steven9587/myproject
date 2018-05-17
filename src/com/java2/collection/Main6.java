package com.java2.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		boolean a;
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (a = scanner.nextLine() != null) {
			String line = scanner.nextLine();
			list.add(line);
		}
		System.out.println(list);
	}
}
