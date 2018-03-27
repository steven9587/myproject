package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList();
		cards.add(1999);
		cards.add(05);
		cards.add(13);
		
		System.out.println("removing number："+cards.remove(0));
		System.out.println(cards.size());
		System.out.println(cards.get(0)+"/"+cards.get(1));
	}

}
