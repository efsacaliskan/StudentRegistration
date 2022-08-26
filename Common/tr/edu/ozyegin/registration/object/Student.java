package tr.edu.ozyegin.registration.object;

public class Student {

	private String studentNumber;
	private String name;
	
	public Student(String studentNumber, String name) {
		this.studentNumber = studentNumber;
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student)obj;
			
			return this.studentNumber.equals(other.studentNumber);
		} else {
			return false;
		}
	}
	
}
