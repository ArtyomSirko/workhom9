package skypro;

public class Author {
    private String festName;
    private String lastName;
    public Author(String festName,String lastName){
        this.festName = festName;
        this.lastName = lastName;
    }
    public String getFestName(){
        return this.festName;
    }
    public String getLastName(){
        return this.lastName;
    }
}