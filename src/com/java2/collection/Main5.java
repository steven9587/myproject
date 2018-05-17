package com.java2.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		boolean a;
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (a = scanner.nextLine() != null) {
			String line = scanner.nextLine();
			int num = Integer.parseInt(line);
			if (num % 2 == 0) {
				list.add(num);
			}
		}
		Collections.reverse(list);
		for(int i:list) {
			System.out.println(i);
		}
	}
}
