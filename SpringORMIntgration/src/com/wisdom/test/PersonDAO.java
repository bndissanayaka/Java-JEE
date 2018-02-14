package com.wisdom.test;

import java.util.List;

public interface PersonDAO {

	void save(Person p);

	List<Person> list();

}
