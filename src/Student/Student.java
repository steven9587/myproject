package Student;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Student {
	String name;//(�ݩ�)
	int english;//(�ݩ�)
	int math;//(�ݩ�)
	int chinese;//(�ݩ�)
	static int pass = 60;
	
	public Student(){
		
	}
	
	

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public Student(String name, int english, int math, int chinese) {
		name = name;
		english = english;
		math = math;
		chinese = chinese;
	}
	
	public Student (String name){
		name = name;
	}
	
	public static void method(){
		System.out.println("hello");
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}