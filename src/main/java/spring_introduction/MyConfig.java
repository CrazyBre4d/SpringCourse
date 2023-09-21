package spring_introduction;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
@PropertySource("classpath:myApp.properties")
@Configuration
//@ComponentScan("spring_introduction")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }

}
