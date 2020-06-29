package com.github.kshitijbist.query;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.github.kshitijbist.model.Book;
import com.github.kshitijbist.service.BookService;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BookQueryResolver implements GraphQLQueryResolver {

	private final BookService bookService;

	public Collection<Book> books() {
		return bookService.getBooks();
	}
}
