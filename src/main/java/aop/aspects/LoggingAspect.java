package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

   /* @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUni() {
    }

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUni(){

    }

    @Pointcut("allMethodsFromUni() && !returnMagazineFromUni() ")
    private void allMethodsExceptReturnMagazineFromUni(){

    }

    @Before("allMethodsExceptReturnMagazineFromUni()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice() : Log #10");
    }*/


   /* @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromUni(){
    }

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromUni(){
    }

    @Pointcut("allGetMethodsFromUni() || allReturnMethodsFromUni()")
        private void allGetAndReturnMethodsFromUni(){

        }


    @Before("allReturnMethodsFromUni()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("allGetMethodsFromUni()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("allGetAndReturnMethodsFromUni()")
    public void beforeGetAndReturnMethodsFromUni() {
        System.out.println("beforeGetAndReturnMethodsFromUni : log #3");
    }
*/





    
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments){
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("информация о книге: название - " + myBook.getName() +
                            "автор - " + myBook.getAuthor() + "год издания - " + myBook.getYearOfPublication());
                } else if(obj instanceof String){
                    System.out.println("книгу в библиотеку добавляет" + obj);
                }
            }
        }
        System.out.println("beforeGetBookAdvice: логирование попытки получить книгу/журнал");
        System.out.println("------------------------");
    }


}
