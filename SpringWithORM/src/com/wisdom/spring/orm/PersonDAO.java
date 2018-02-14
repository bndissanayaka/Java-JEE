package com.wisdom.spring.orm;

import java.util.List;

public interface PersonDAO {

	List<Person> list();

	void save(Person p);

}
