package com.wildcodeschool.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.rest.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    


   public List<Book> findByTitleContainingOrDescriptionContaining(String searchTerm,String searchTerm2);
}
