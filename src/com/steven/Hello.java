package com.steven;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
	//
		System.out.println("Hello World");
    
		person p = new person();
	    p.sayHello();
	//
	   System.out.println("�п�J�z���W�r�G");
	   Scanner scanner = new Scanner(System.in);
	   String line = scanner.nextLine();
	   System.out.println("Hello!"+line);
	//
	   System.out.println("�A�X���r?");
	   line = scanner.nextLine();
	   int age = Integer.parseInt(line);
	   System.out.println(line);
	   System.out.println( !(age > 18));

	}

}
