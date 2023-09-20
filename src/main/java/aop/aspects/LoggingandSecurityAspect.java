package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingandSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
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
    }


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




    /*@Pointcut("execution(* get*())")
    private void allGetMethods(){}
    
    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги");
    }*/
}
