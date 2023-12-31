package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class newLoggingAspect {
    @Around("execution( public String returnBook())")
    public Object aroundReturningBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningBookAdvice(): в библиотеку пытаются вернуть книгу");
        Object targetMethodResult = null;

        try {
             targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println(" aroundReturningBookAdvice: ловим логируем исключение " + e);
           throw e;
        }




        System.out.println("aroundReturningBookAdvice(): в библиотеку успешно вернули книгу");
        return targetMethodResult;
    }
}
