package com.rad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Component
@ToString
@Scope(value = "prototype")
public class Student {
	private int studId;
	private String studName;
	private String studDepartment;
	@Qualifier("book")
	@Autowired
	private Book book;
	void display() {
		System.out.println("student class method executed");
		book.test();
	}
}
