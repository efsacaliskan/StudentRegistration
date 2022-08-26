package tr.edu.ozyegin.registration.data;

import java.util.ArrayList;

import java.util.List;

import tr.edu.ozyegin.registration.object.Employee;
import tr.edu.ozyegin.registration.object.Professor;

public class Employees {

	private List<Employee> employees;
	
	public Employees() {
		
		this.employees = new ArrayList<Employee>();
		
		this.employees.add(new Professor("1227", "Yasar Safkan"));
	}

	public Employee getEmployeeById(String employeeId) {
		for(Employee e :  this.employees) {
			if(e.getEmployeeId().equals(employeeId)) {
				return e;
			}
		}
		return null;
	}
	
}

