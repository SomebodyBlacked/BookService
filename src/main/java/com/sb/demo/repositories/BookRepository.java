package com.sb.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sb.demo.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}