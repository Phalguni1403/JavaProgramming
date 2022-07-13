class StudentData {
	final int ROLLNO;

	public StudentData(int rnum) {
		ROLLNO = rnum;
	}

	void display() {
		System.out.println("Roll no is: " + ROLLNO);
	}
}

public class FinalVariable extends StudentData {

	public FinalVariable(int rnum) {
		super(rnum);
	}

	public static void main(String[] argms) {
		StudentData r1 = new StudentData(101);
		r1.display();
		System.out.println(r1.ROLLNO);

	}
}