package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CourseTest {
    @Test
    public void testAddStudent() {
        Course course = new Course("Mathematics", 30);
        Student student = new Student("Alice Smith", "003");
        course.addStudent(student);
        assertTrue(course.getStudents().contains(student));
    }
}