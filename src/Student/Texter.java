package Student;

public class Texter {

	public static void main(String[] args) {
		Student stu = new Student("¤ı¤p©ú",55,66,77);
		//stu.english = 55;
		//stu.math = 66;
		//stu.chinese = 77;
		
		stu.print();
		int avg =stu.getAverage();
		System.out.println(stu.name+":"+avg);
	}
}
