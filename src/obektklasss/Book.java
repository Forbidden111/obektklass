package obektklasss;

import java.util.Objects;

public class Book {
    private String name;

    private  Author autor;
    private int year;

    public Book(String name, Author autor, int  year){
        this.name=name;
        this.autor=autor;
        this.year=year;
    }

    public Author getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(autor, book.autor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor=" + autor +
                ", year=" + year +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, autor, year);
    }
}
