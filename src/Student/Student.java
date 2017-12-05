package Student;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Student {
	String name;
	int english;
	int math;
	int chinese;

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public Student(String n, int e, int m, int c) {
		name = n;
		english = e;
		math = m;
		chinese = c;
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}