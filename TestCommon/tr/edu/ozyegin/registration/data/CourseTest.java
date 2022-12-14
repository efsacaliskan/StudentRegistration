package tr.edu.ozyegin.registration.data;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tr.edu.ozyegin.registration.object.Course;

class CourseTest {
	 
	private Course course;
	 
	@BeforeEach
	void setup() {
		this.course = new Course("CS 102", "Object Oriented Programming",6);
	}
	
	@Test
	void testCourseCode() {
	
		assertEquals("CS 102", course.getCode());	
	}
	
	@Test
	void testCourseTitle() {
	
		assertEquals("Object Oriented Programming", course.getTitle());
		
	}

}
