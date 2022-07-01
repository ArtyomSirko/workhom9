package skypro;

public class Book {
    private String name;
    private int pageAmount;
    skypro.Author author;

    public Book(String name, int pageAmount, skypro.Author author) {

        this.name = name;
        this.pageAmount = pageAmount;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getPageAmount() {
        return this.pageAmount;
    }
}
