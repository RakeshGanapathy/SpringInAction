package com.rad;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component("book")
public class Book {

	String bookId;
	String bookName;
	void test() {
		System.out.println("Book instantiated");
		log.info("{},{}",bookId,bookName);
	}
}