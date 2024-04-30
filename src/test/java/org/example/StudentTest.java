package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testGetName() {
        Student student = new Student("Bob Johnson", "004");
        assertEquals("Bob Johnson", student.getName());
    }
}