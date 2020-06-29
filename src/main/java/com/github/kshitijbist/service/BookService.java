package com.github.kshitijbist.service;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.github.kshitijbist.model.Book;

@Service
public class BookService {

	private static int index;
	private Collection<Book> books;

	@PostConstruct
	private void init() {
		index = 0;
		books = new ConcurrentLinkedQueue<>();
	}

	public Book createBook(final int id, final String name, final int pageCount, final String publisher, final long price) {
		Book book = new Book(++index, name, pageCount, publisher, price);
		books.add(book);
		return book;
	}

	public Collection<Book> getBooks() {
		return Collections.unmodifiableCollection(books);
	}
}
