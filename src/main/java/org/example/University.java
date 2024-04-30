package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages the courses at a university,
 * including course registration and enrollments.
 */
public final class University {
    /**
     * Map of courses offered by the university.
     */
    private Map<String, Course> courses = new HashMap<>();

    /**
     * Adds a new course to the university if not already present.
     *
     * @param course the course to be added
     */
    public void addCourse(final Course course) {
        if (course != null && !courses.containsKey(course.getCourseName())) {
            courses.put(course.getCourseName(), course);
        }
    }

    /**
     * Returns the number of courses currently offered by the university.
     *
     * @return the count of courses
     */
    public int getCourseCount() {
        return courses.size();
    }

    /**
     * Registers a student for a course
     * if the course is offered by the university.
     *
     * @param student the student to register
     * @param course the course for which the student is registering
     */
    public void registerStudentForCourse(final Student student,
                                         final Course course) {
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    /**
     * Prints the enrollment details for each course offered by the university.
     */
    public void printEnrollments() {
        for (Course course : courses.values()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName());
            }
        }
    }
}
