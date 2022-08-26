package tr.edu.ozyegin.registration.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tr.edu.ozyegin.registration.object.Course;
import tr.edu.ozyegin.registration.object.Registration;
import tr.edu.ozyegin.registration.object.Student;

class RegistrationTest {

	private Registration registration;
	
    @BeforeEach
    void setup() {
    	Student student = new Student("12345", "Yaþar Safkan");
    	Course course = new Course("CS 102", "Object Oriented Programming", 6);
    	
    	this.registration = new Registration(student,course);
    }

	@Test
	void testStudentRegistreted() {
		Student myStudent =  new Student("12345", "Yaþar Safkan");
		
		assertEquals(myStudent, registration.getRegisteredStudent());
	}
	
	@Test
	void testCourseRegistreted() {
		Course myCourse =  new Course("CS 102", "Object Oriented Programming", 6);
		
		assertEquals(myCourse, registration.getRegisteredCourse());
	}

}
