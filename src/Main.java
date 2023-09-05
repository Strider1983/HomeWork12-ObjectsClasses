import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Объекты и Классы");
        Author levTolstoy = new Author("Лев", "Толстой");
        Book sunday = new Book("Воскресенье", levTolstoy, 1899);
        System.out.println("Название книги: " + sunday.getTitle());
        System.out.println("Автор: " + levTolstoy.getName() + levTolstoy.getSurName());
        System.out.println("Год издания: " + sunday.getYear());
    }

}