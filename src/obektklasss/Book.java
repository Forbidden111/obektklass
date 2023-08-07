package obektklasss;

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
}
