import Week11.Course;
import Week11.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        System.out.println("First test:");
        ArrayList<Student> students1 = new ArrayList<Student>(Arrays.asList(new Student(0, "John"), new Student(1, "Sam")));
        ArrayList<Student> students2 = new ArrayList<Student>(Arrays.asList(new Student(2, "Mary"), new Student(3, "Ted")));
        Course course1 = new Course(200, "Math", students1);
        Course course2 = course1.clone();
        course2.setName("Java");
        course2.setId(100);
        course2.students.add(new Student(100, "Zhandos"));
        System.out.println(course1.toString());
        System.out.println(course2.toString() + "\n");

        System.out.println("Second test:");
        ArrayList<Student> students3 = new ArrayList<Student>(Arrays.asList(new Student(4, "Kate"), new Student(5, "QQQ")));
        Course course3 = new Course(300, "C++", students3);
        Course[] courses = new Course[]{course1, course2, course3};
        System.out.println("Courses before sorting:");
        int i = 0;
        for (Course course : courses) {
            System.out.println(i + ") " + course.toString());
            i += 1;
        }
        Arrays.sort(courses);
        System.out.println("Courses after sorting:");
        i = 0;
        for (Course course : courses) {
            System.out.println(i + ") " + course.toString());
            i += 1;
        }
    }
}