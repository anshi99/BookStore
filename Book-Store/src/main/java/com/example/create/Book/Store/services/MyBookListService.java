package com.example.create.Book.Store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.create.Book.Store.entities.MyBookList;
import com.example.create.Book.Store.repositories.MyBookRepo;


@Service
public class MyBookListService {

	@Autowired
	private MyBookRepo mybook;
	
	public void saveMyBooks(MyBookList book) {
		
		mybook.save(book);
	}
}
