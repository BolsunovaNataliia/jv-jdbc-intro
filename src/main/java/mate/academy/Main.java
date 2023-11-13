package mate.academy;

import mate.academy.dao.BookDao;
import mate.academy.lib.Injector;
import mate.academy.model.Book;

import java.math.BigDecimal;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        BookDao bookDao = (BookDao) injector.getInstance(BookDao.class);
        Book book1 = new Book("Clean code", BigDecimal.valueOf(25.33));
        Book book2 = new Book("Spring in Action", BigDecimal.valueOf(39.51));
        Book book3 = new Book("Test-Driven Java Development", BigDecimal.valueOf(49.99));
        bookDao.create(book1);
        bookDao.create(book2);
        bookDao.create(book3);
        bookDao.findById(1L);
        bookDao.findAll();
        book3.setId(1L);
//        bookDao.update(book3);
        bookDao.deleteById(1L);
    }
}
