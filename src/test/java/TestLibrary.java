import library.Book;
import library.LibraryImpl;
import library.Reader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class TestLibrary {
    private static LibraryImpl library = new LibraryImpl();

    @Test
    void testAddBook() throws SQLException {
        Book book = new Book();
        book.setTitle("Собачье сердце");
        book.setAuthor("Михаил Булгаков");
        book.setPublishedYear(1925);
        book.setGenre("Повесть");

        Book added = library.addBook(book);
        Assertions.assertNotNull(added.getId());
        Assertions.assertEquals("Собачье сердце", added.getTitle());
    }

    @Test
    void testUpdateBookStatus() throws SQLException {
        String newStatus = "Роман+++";
        Book updated = library.updateStatusBook(1, newStatus);
        Assertions.assertEquals(newStatus, updated.getGenre());
    }

    @Test
    void testAddReader() throws SQLException {
        Reader reader = new Reader();
        reader.setName("Анна Петрова");
        reader.setEmail("anna.petrov@gmail.com");
        reader.setPhone("+879001234567");

        Reader added = library.addReader(reader);

        Assertions.assertNotNull(added.getId());
        Assertions.assertEquals("Анна Петрова", added.getName());
    }

}


