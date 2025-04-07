
package org;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20, "PHP", 3.5));
        students.add(new Student("Bob", 16, "Java", 7.8));
        students.add(new Student("Charlie", 22, "Java", 9.3));
        students.add(new Student("Diana", 19, "PHP", 4.8));
        students.add(new Student("Alfonso", 23, "Java", 7.6));
        students.add(new Student("Fiona", 20, "PHP", 9.2));
        students.add(new Student("George", 17, "Java", 8.6));
        students.add(new Student("Hannah", 22, "PHP", 4.9));
        students.add(new Student("Ian", 19, "PHP", 8.7));
        students.add(new Student("Jessica", 20, "Java", 9.3));

        System.out.println("ALL STUDENTS :");
        Lambda.allStudentsList(students);

        System.out.println("STUDENTS WITH A :");
        Lambda.studentsWithA(students);

        System.out.println("STUDENTS WITH A MARK > 5 :");
        Lambda.markSupTo5(students);

        System.out.println("STUDENTS WITH A MARK > 5 AND NOT COURSING PHP:");
        Lambda.supTo5YNoPhp(students);

        System.out.println("STUDENTS COURSING JAVA AND AGE >= 18:");
        Lambda.javaAnd18(students);
    }
}
