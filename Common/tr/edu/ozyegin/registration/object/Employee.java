package tr.edu.ozyegin.registration.object;

public abstract class Employee {
	
	protected String employeeId;
	protected String fullName;
	
	public Employee() {
		
	}

	public String getEmployeeId() { // non abstract
		return employeeId;
	}

	
	public String getFullName() { // non abstract
		return fullName;
	}


	public abstract boolean canTeachCourses(); // abstract
	
	public abstract boolean canAdministerCourses(); // abstract

	
	
}


