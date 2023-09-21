package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {

    public Dog(){
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
/*    @PostConstruct
   protected void init(){
        System.out.println("class dog : init method");
    }
    @PreDestroy
    private void destroy(){
        System.out.println("class dog: destroy method");
    }*/
}
