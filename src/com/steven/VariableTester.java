package com.steven;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		int age = 0;
		float weight = 69.5f;
		char c = 65;
		char c2 = 'Z';
		int i = c2;
		System.out.println(i);
	    //
		boolean pass = false;
		System.out.println(!pass);
	    System.out.println(pass);
	   //��r���Ӽ�  
	    String s = new String("Hello");
	    int len = s.length();
	    System.out.println("len:" + len );
	    System.out.println(s.charAt(0) );
	   // 
	    Random r = new Random();
	    int n1 = r.nextInt(6)+1;
	    int n2 = r.nextInt(6)+1;
	    int n3 = r.nextInt(6)+1;
	    int n4 = r.nextInt(6)+1;
	  //  
	    System.out.println(3 <= 2);
	  //
		float f = 5.0f;
	    int x = 5;
		int y = 3;
	    int z = x % y;
	    System.out.println(z);
	    
	    System.out.println(x == y);
	    System.out.println(x != y);
	    System.out.println(x > y);
	    System.out.println(x < y);
	    System.out.println(x >= y);
	    System.out.println(x <= y);
	  //
	    System.out.println(x >> 1);//x���k�@��bit
	    x++;//x�֥[�]�i�Hx = x + 1
	    x--;//x�ִ�]�i�Hx = x + 1
	    System.out.println(x);
	  //�r������
	    String data = "123";
	    int n = Integer.parseInt(data);
	  //�����r��
	    String mydata = String.valueOf(n);
	    
	    
	    		
	    		
	    		
	    
	    
	    
	}

}
