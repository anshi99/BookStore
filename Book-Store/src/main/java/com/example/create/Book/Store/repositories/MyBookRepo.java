package com.example.create.Book.Store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.create.Book.Store.entities.MyBookList;

@Repository
public interface MyBookRepo extends JpaRepository<MyBookList, Integer> {

}
