import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Library {
    private ArrayList<Book> booksList;
    private HashSet<Book> booksSet;
    private HashMap<Integer, Book> booksMap;

    public Library() {
        booksList = new ArrayList<>();
        booksSet = new HashSet<>();
        booksMap = new HashMap<>();
    }

    public void addBook(Book book) {
        if (booksSet.add(book)) {
            booksList.add(book);
            booksMap.put(book.getId(), book);
        } else {
            System.out.println("Книга с ID " + book.getId() + " уже существует.");
        }
    }

    public void removeBookById(int id) {
        Book book = booksMap.remove(id);
        if (book != null) {
            booksList.remove(book);
            booksSet.remove(book);
            System.out.println("Книга с ID " + id + " удалена.");
        } else {
            System.out.println("Книга с ID " + id + " не найдена.");
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : booksList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Книга с названием \"" + title + "\" не найдена.");
        return null;
    }

    public void listAllBooks() {
        if (booksList.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            booksList.forEach(System.out::println);
        }
    }

    public void listBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : booksList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книги автора \"" + author + "\" не найдены.");
        }
    }
}
