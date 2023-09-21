package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
/*     @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice(): логируем получение списка студентов перед getStudents");
    }*/


   /* @AfterReturning(pointcut = "execution(* getStudents())", returning = "students" )
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){

        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrage = firstStudent.getAvgGrade();
        avgGrage = avgGrage + 1;
        firstStudent.setAvgGrade(avgGrage);

        System.out.println("afterReturningStudentsLoggingAdvice(): логируем получение списка студентов после getStudents");
    }*/

/*    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsLoggingAdvice(): логируем выброс " + exception);
    }*/

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice(): логируем нормальное окончание работы или выброс ");
    }
}
