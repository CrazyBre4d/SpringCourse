package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<Student>();
    public  void addStudent(){
        Student st1 = new Student("kabakov vlas", 4, 7.6);
        Student st2 = new Student("zaur regulov", 2 ,6.5);
        Student st3 = new Student("babekon annanas", 1, 9);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudents(){
        System.out.println(" начало get students");
        System.out.println(students.get(3));
        System.out.println(" info from method getStudents:" + students);
        return students;
    }
}
