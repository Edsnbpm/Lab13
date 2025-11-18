package org.example.library.repo.mem;

import org.example.library.model.Book;
import org.example.library.repo.BookRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryBookRepository implements BookRepository {
    private final Map<String, Book> data = new HashMap<>();

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.ofNullable(data.get(isbn));
    }

    @Override
    public void save(Book book) {
        data.put(book.getIsbn(), book);
    }
}
