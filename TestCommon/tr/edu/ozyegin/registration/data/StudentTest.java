package tr.edu.ozyegin.registration.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tr.edu.ozyegin.registration.object.Student;

class StudentTest {
	
	private Student student ;
	
	@BeforeEach
	void setup() {
		this.student = new Student("12345", "Ya�ar Safkan");
	}

	@Test
	void testStudentNumber() {
		
		assertEquals("12345", student.getStudentNumber());
	}
	
	@Test
	void testName() {
		
		assertEquals("Ya�ar Safkan", student.getName());
	}

}
