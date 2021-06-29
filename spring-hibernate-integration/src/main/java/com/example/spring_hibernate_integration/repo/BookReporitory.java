package com.example.spring_hibernate_integration.repo;

import java.util.List;

import com.example.spring_hibernate_integration.model.Book;

public interface BookReporitory {
	
	public Book createBook(Book book);
	
	public List<Book> getAllBook();

}