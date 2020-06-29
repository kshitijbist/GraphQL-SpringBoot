package com.github.kshitijbist.mutation;

import org.springframework.stereotype.Component;

import com.github.kshitijbist.model.Book;
import com.github.kshitijbist.service.BookService;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BookMutationResolver implements GraphQLMutationResolver {

	private final BookService bookService;

	public Book createBook(final int id, final String name, final int pageCount, final String publisher, final long price) {
		return bookService.createBook(id, name, pageCount, publisher, price);
	}
}
