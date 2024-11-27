package com.sb.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.demo.models.Book;
import com.sb.demo.repositories.BookRepository;

@RestController
@RequestMapping("books")
public class BooksController {
  @Autowired
  private BookRepository bookRepository;

  @GetMapping
  public Iterable<Book> getBooks() {
    return bookRepository.findAll();
  }

  @GetMapping("count")
  public long countBooks() {
    return bookRepository.count();
  }

  @PostMapping
  public Book addBook(@RequestBody Book book) {
    return bookRepository.save(book);
  }
}
