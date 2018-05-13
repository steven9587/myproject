package com.java2.collection;

import java.util.ArrayList;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.remove(0);
		list.remove(1);
		list.remove(2);
		list.remove(3);

        System.out.print(list.get(2));
        System.out.print(" "+list.get(1));
        System.out.print(" "+list.get(0));
	}

}
