package obektklasss;

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
}
