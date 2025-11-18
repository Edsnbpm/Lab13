package org.example.library.repo;

import org.example.library.model.Book;
import java.util.Optional;

public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);
    void save(Book book);
}
