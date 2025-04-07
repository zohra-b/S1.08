package org;

import java.util.List;

public class Lambda {

    public static void allStudentsList(List<Student> students) {
        students.forEach(student -> System.out.println("Name : " + student.getName() + " - age : " + student.getAge()));
    }


    public static void studentsWithA(List<Student> students){
        List<Student> studentsWithA = students.stream()
                .filter(s -> s.getName().startsWith("A"))
                .toList();

        studentsWithA.forEach(student -> System.out.println("Name : "+ student.getName() + " - age : " + student.getAge()));
    }

    public static void markSupTo5(List<Student> students){
        List<Student> markSupTo5 =  students.stream()
                .filter(s -> (s.getMark() >= 5))
                .toList();

        markSupTo5.forEach(student -> System.out.println("Name : "+ student.getName() + " - mark : " + student.getMark()));
    }

    public static void supTo5YNoPhp(List<Student> students){
        List<Student> supTo5YNoPhp =  students.stream()
                .filter(s -> (s.getMark() >= 5))
                .filter(s -> (!s.getCourse().equals("PHP")))
                .toList();

        supTo5YNoPhp.forEach(student -> System.out.println("Name: "+ student.getName() + " - mark: " + student.getMark() + " - course:" +student.getCourse() ));
    }

    public static void javaAnd18(List<Student> students){
        List<Student> javaAnd18 = students.stream()
                .filter(s -> s.getCourse().equalsIgnoreCase("Java"))
                .filter(s -> (s.getAge()>=18))
                .toList();

        javaAnd18.forEach(student -> System.out.println("Name: "+ student.getName() + " - age: " + student.getAge() + " - course:" +student.getCourse() ));
    }
}
