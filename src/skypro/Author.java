package skypro;

import java.util.Objects;

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

    public String authorString() {
        return festName + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getFestName().equals(author.getFestName()) && getLastName().equals(author.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFestName(), getLastName());
    }
}