package com.example.spring_hibernate_integration.repo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring_hibernate_integration.model.Book;

@Repository
@EnableTransactionManagement
public  class BookReporitoryImpl implements BookReporitory {

	private SessionFactory sessionFactory;

	@Autowired
	public BookReporitoryImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		System.out.println(sessionFactory);
	}

	@Override
	@Transactional
	public Book createBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(book);
		return book;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBook() {
		Session currentSession=sessionFactory.openSession();
		Query query=currentSession.createQuery("select B from Book B",Book.class);
		return query.getResultList();
	}

}