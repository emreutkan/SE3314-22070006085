package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class UniversityTest {
    @Test
    public void testAddCourse() {
        University university = new University();
        Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        assertEquals(1, university.getCourseCount());
    }

    @Test
    public void testRegisterStudentForCourse() {
        University university = new University();
        Student student = new Student("John Doe", "002");
        Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        university.registerStudentForCourse(student, course);
        assertTrue(course.getStudents().contains(student));
    }
}
