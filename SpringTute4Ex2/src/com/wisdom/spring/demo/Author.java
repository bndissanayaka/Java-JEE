package com.wisdom.spring.demo;

public class Author {
	private Integer id;
	private String name;

	public Author() {
		this(-1, null);
	}

	public Author(Integer id) {
		this(id, null);
	}

	public Author(Integer id, String name) {
		this.id = id;
		this.name = name;
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
		result.append("[Id = " + id + ", Name = " + name + "]");
		return result.toString();
	}
}