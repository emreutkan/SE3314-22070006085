package org.example;

/**
 * Represents a student with a name and student ID.
 */
public final class Student {
    /**
     * Name of the student.
     */
    private String studentName;

    /**
     * ID of the student.
     */
    private String studentID;

    /**
     * Constructs a new Student instance.
     *
     * @param name the name of the student
     * @param id the student ID
     */
    public Student(final String name, final String id) {
        this.studentName = name;
        this.studentID = id;
    }

    /**
     * Returns the name of the student.
     *
     * @return the name of the student
     */
    public String getName() {
        return studentName;
    }

}
