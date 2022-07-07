package skypro;

import java.util.Objects;

public class Book {
    private String name;
    private int pageAmount;
    private Author author;
    public Book(String name, int pageAmount,Author author) {

        this.name = name;
        this.pageAmount = pageAmount;
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPageAmount() {
        return this.pageAmount;
    }


  @Override
    public String toString() {
        return name+":"+pageAmount+"-года издания, автор:"+ author.authorString();
    }


}
