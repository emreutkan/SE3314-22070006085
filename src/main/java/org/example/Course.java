package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a course with a fixed capacity and a list of enrolled students.
 */
public final class Course {
    /**
     * Counter for the total number of courses created.
     */
    private static int totalCourses = 0;

    /**
     * Name of the course.
     */
    private final String courseName;

    /**
     * Maximum number of students that can enroll in the course.
     */
    private final int capacity;

    /**
     * List of students currently enrolled in the course.
     */
    private final List<Student> students = new ArrayList<>();

    /**
     * Constructs a new Course instance.
     *
     * @param name     the name of the course
     * @param capacity the maximum number of students that can enroll
     */
    public Course(final String name, final int capacity) {
        this.courseName = name;
        this.capacity = capacity;
        totalCourses++;
    }

    /**
     * Adds a student to the course if there is capacity.
     *
     * @param student the student to add
     */
    public void addStudent(final Student student) {
        if (students.size() < capacity) {
            students.add(student);
        }
    }

    /**
     * Returns the name of the course.
     *
     * @return the name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Returns the total number of courses created.
     *
     * @return the total number of courses
     */
    public static int getTotalCourses() {
        return totalCourses;
    }

    /**
     * Returns the list of students enrolled in the course.
     *
     * @return the list of students
     */
    public List<Student> getStudents() {
        return students;
    }

}
