package Student;

public class Texter {

	public static void main(String[] args) {
		Student stu1 = new Student("���p��",55,66,77);
		Student stu2 = new Student("���j��",77,99,88);
		//Student stu = new Student("���p��");
		//stu.english = 55;
		//stu.math = 66;
		//stu.chinese = 77;
		
		stu1.pass = 50 ; 
		stu1.print();
		stu2.print();
		int avg =stu1.getAverage();
		System.out.println(stu1.name+":"+avg);
		Student.method();
		GraduateStudent gstu = new GraduateStudent();
		gstu.print();
		
	
	}
}
