package com.adv.springbootrest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookContoller {

	@GetMapping(path = "/books")
	public List<Book> getBooks() {

		List<Book> books = new ArrayList<>();
		books.add(new Book("book1"));
		books.add(new Book("book2"));
		books.add(new Book("book3"));

		return books;

	}

}
