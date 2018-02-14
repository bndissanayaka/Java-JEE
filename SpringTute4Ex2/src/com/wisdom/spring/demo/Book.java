package com.wisdom.spring.demo;

public class Book {
	private Integer id;
	private String name;
	private Integer authorId;
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("[Id = " + id + ", Name = " + name + ", Author Id = " + authorId + ", Author = " + author + "]");
		return result.toString();
	}
}
