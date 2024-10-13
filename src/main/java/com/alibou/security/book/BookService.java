package com.alibou.security.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void save(BookRequest request) {
        var book = new Book();
                book.setId(request.getId());
        book.setAuthor(request.getAuthor());
        book.setIsbn(request.getIsbn());

        repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }
}
