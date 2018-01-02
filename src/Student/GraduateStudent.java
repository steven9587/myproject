package Student;

public class GraduateStudent extends Student {
	int thesis;

	public GraduateStudent() {
		super();

	}

	@Override//½Æ¼g
	public void print() {
		super.print();
		System.out.println(english + "\t" + math + "\t" + chinese + "\t" + thesis);
	}
	
	@Override//½Æ¼g
	public int getAverage() {
		return (english + math + chinese + thesis) / 4;
	}
}
