package com.example.create.Book.Store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.create.Book.Store.entities.Book;
import com.example.create.Book.Store.repositories.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bRepo;
	
	public void save(Book b) {
		
		bRepo.save(b);
	}
	
	public List<Book> getAllBook(){
		
		return bRepo.findAll();
	}
	

	public Book getBookById(int id) {
		
		return bRepo.findById(id).get();
	}
}
