package Student;

public class GraduateStudent extends Student {
	int thesis;

	public GraduateStudent() {
		super();

	}

	@Override//�Ƽg
	public void print() {
		super.print();
		System.out.println(english + "\t" + math + "\t" + chinese + "\t" + thesis);
	}
	
	@Override//�Ƽg
	public int getAverage() {
		return (english + math + chinese + thesis) / 4;
	}
}
