import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ListOfStudents {

    public static void main(String[] args) {
        List<Student> students= Arrays.asList(
            new Student("John", "Smith", "Miami", 8.38, 19, "Civil"),
            new Student("Mike", "Miles", "New York", 8.4, 21, "IT"),
            new Student("Micheal", "Peterson", "New York", 7.5, 20, "Civil"),
            new Student("James", "Robertson", "Miami", 9.1, 20, "IT"),
            new Student("John", "Miller", "Miami", 7.83, 20, "Education")

        );


        //1. Find all students from Miami with a grade > 8.0:
        List<Student> miamiWithGrade = students.stream()
                .filter(s -> s.getCity().equalsIgnoreCase("Miami") && s.getGrade() > 8.0)
                .collect(Collectors.toList());
        System.out.println("Students from Miami with a grade > 8.0 :  " + miamiWithGrade);


        //2. find the student with the highest grade.

        Optional<Student> highestGrade = students
                .stream().max(Comparator.comparing(Student::getGrade));
        highestGrade.ifPresent(s-> System.out.println("Highest Grade: "+ s));

         //3. Count the number of each student in each department.
        Map<String, Long> deptCount = students.stream()
                .collect(groupingBy(Student::getDepartment, counting()));
        System.out.println("Students per Department: "+ deptCount);


         //4. Find the average grade in department.



         //5. Sort students by age, then by grade.


         //6. Get  a comma-seperated list of students names.


         //7. Check if all students are above 18.


         //8. Find the department with the most students.


         //9. Partitions students into grade > 8.0 and grade <= 8.0.


         //10. Find the students with the longest full name.


    }
}
