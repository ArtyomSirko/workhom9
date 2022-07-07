package skypro;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        Book tarasBulba = new Book("Taras Bulba", 1835, new Author("Nikolay", "Gogol"));
        String c = tarasBulba.toString();
        System.out.println(c);

        Book voinaImir = new Book("Voina i Mir", 1820, new Author("Lev", "Tolstoy"));
        String v = voinaImir.toString();
        System.out.println(v);
        Book[] books = {tarasBulba, voinaImir};
        Book[] tolstoyBooks = new Book[1000];
        int index = 0;
        for (Book book : books) {
            if ("Lev Tolstoy".equals(book.getAuthor().getFestName() + " " + book.getAuthor().getLastName())) {
                tolstoyBooks[index] = book;
                index++;
            }
        }
        System.out.println(Arrays.toString(tolstoyBooks));
    }


}


