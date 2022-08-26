package tr.edu.ozyegin.registration.object;

public class Professor extends Employee {

	public Professor(String employeeId, String fullName) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		
	}

	
	@Override
	public boolean canTeachCourses() {
		return true;
	}

	@Override
	public boolean canAdministerCourses() {
		return false;
	}

}
