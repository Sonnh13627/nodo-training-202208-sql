package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Stream;

public class StudentTest {
    public static List<Student>filter(List<Student>students, Student.Filter<Student> pred){
        List<Student> list = new ArrayList<>();
        for (Student student:students){
            if (pred.valid(student)){
                list.add(student);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nguyen Hong Son",20));
        students.add(new Student("Pham Thi Thuy",20));
        students.add(new Student("Nguyen Thi Thu Ha",19));
        students.add(new Student("Thieu Quan Vinh",20));
//        Student.Filter<Student> older = student -> student.getAge()>=20;
//        List<Student> filered = filter(students, older);
//        for (Student student: filered) {
//            System.out.println(student);
//        }

//
//        Collections.sort(students,(Student student1,Student student2)-> student1.getAge()-student2.getAge());
//        students.forEach(student -> System.out.println(student));


//        Stream<Student> stream = students.stream().sorted((student1, student2)-> student1.getAge()-student2.getAge());
//        stream.forEach(student -> System.out.println(student));
    }
}
