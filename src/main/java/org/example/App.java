package org.example;

/**
 * The main application class.
 */
public final class App {

    private App() {
        // Private constructor to prevent instantiation of utility class
    }

    /**
     * The main method where the application starts.
     *
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        University myUniversity = new University();
        Student stud1 = new Student("Jane Doe", "001");
        Student student2 = new Student("John Smith", "002");
        final int softwareEngineeringCapacity = 30;
        final int dataStructuresCapacity = 40;
        Course course1 = new Course(
                "Software Engineering", softwareEngineeringCapacity);
        Course course2 = new Course(
                "Data Structures", dataStructuresCapacity);

        myUniversity.addCourse(course1);
        myUniversity.addCourse(course2);
        myUniversity.registerStudentForCourse(stud1, course1);
        myUniversity.registerStudentForCourse(student2, course2);

        System.out.println("Total courses offered: "
                +
                Course.getTotalCourses());
        myUniversity.printEnrollments();
    }
}
