package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Мы берем книгу из uni ");
    }
    public void addBook(){
        System.out.println("Мы добавляем книгу в uni ");
    }

    public void returnBook(){
        System.out.println("возвращаем книгу");

    }
    public void getMagazine(){
        System.out.println("Мы берем журнал из uni");
    }
    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в uni");
    }
    public void addMagazine(){
        System.out.println("Мы добавляем журнал в uni ");
    }
}
