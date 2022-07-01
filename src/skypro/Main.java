package skypro;


public class Main {


    public static void main(String[] args) {

        skypro.Author author= new skypro.Author("Nikolay", "Gogol");
        Book tarasBulba = new Book("Taras Bulba", 1835,author);
        System.out.println("Название книги:" + tarasBulba.getName());
        System.out.println("Год публикации:" + tarasBulba.getPageAmount());
        System.out.println("Автор:"+author.getFestName()+" "+author.getLastName());
        skypro.Author author1 =new Author("Lev","Tolstoy");


        Book voinaImir=new Book("Voina i Mir",1820,author1);
        System.out.println("Название книги:" + voinaImir.getName());
        System.out.println("Год публикации:" + voinaImir.getPageAmount());
        System.out.println("Автор:"+author1.getFestName()+" "+author1.getLastName());

    }
}