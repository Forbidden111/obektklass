package obektklasss;

import java.util.Objects;

public class Author {
    private String name;
    private String famaly;

    public Author (String name,String famaly){
        this.name=name;
        this.famaly=famaly;
    }
    public String getName(){
        return name;
    }
    public String getFamaly(){
        return famaly;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", famaly='" + famaly + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(famaly, author.famaly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, famaly);
    }
}
