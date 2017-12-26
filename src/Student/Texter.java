package Student;

public class Texter {

	public static void main(String[] args) {
		Student stu = new Student("王小明",55,66,77);
		//Student stu = new Student("王小明");
		//stu.english = 55;
		//stu.math = 66;
		//stu.chinese = 77;
		
		stu.print();
		int avg =stu.getAverage();
		System.out.println(stu.name+":"+avg);
		
		GraduateStudent gstu = new GraduateStudent();
		gstu.print();
	}
}
