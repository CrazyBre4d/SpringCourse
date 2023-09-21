package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Мы берем книгу из uni ");
        System.out.println("------------------------");
    }
    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу в uni ");
        System.out.println("------------------------");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("возвращаем книгу");
        return "Война и Мир";
    }
    public void getMagazine(){
        System.out.println("Мы берем журнал из uni");
        System.out.println("------------------------");
    }
    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в uni");
        System.out.println("------------------------");
    }
    public void addMagazine(){
        System.out.println("Мы добавляем журнал в uni ");
        System.out.println("------------------------");
    }
}
