package com.prasad.repository;

import org.springframework.data.repository.CrudRepository;

import com.prasad.entity.Books;

public interface BookRepository extends CrudRepository<Books, Integer>{

}
