package com.github.kshitijbist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
	private int id;
	private String name;
	private int pageCount;
	private String publisher;
	private long price;
}
