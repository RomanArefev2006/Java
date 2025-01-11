import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1, "Мастер и маргарита", "Михаил Булгаков"));
        library.addBook(new Book(2, "Убийство в восточном экспрессе", "Агата Кристи"));
        library.addBook(new Book(3, "Война и мир", "Лев Толстой"));
        library.addBook(new Book(4, "Судьба человека", "Михаил Шолохов"));

        library.removeBookById(3);

        Book book = library.findBookByTitle("Судьба человека");
        if (book != null) {
            System.out.println("Найдена книга: " + book);
        }

        System.out.println("Все книги в библиотеке:");
        library.listAllBooks();

        System.out.println("Книги автора Лев Толстой:");
        library.listBooksByAuthor("Лев Толстой");
    }
}


