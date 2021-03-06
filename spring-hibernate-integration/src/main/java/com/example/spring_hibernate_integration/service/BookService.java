package com.example.spring_hibernate_integration.service;

import java.io.IOException;
import java.util.List;

import com.example.spring_hibernate_integration.model.Book;

public interface BookService {
	public Book createBook(Book book);
	public List<Book> displayAllBooks();
	public Book findBookById(int id);
	public Book updateBook(int id) throws IOException;
	public void deleteBook(int id);
	

}