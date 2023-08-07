import obektklasss.Author;
import obektklasss.Book;

public class Main {
    public static void main(String[] args) {
        Author author1=new Author("Лев" , "Толстой");
        Book book1= new Book("Война и мир" , author1 , 1863);
        Author author2= new Author("Cергей" , "Пушкин" );
        Book book2=new Book("Мир", author2, 1883);
        book1.setYear(1859);
    }

}