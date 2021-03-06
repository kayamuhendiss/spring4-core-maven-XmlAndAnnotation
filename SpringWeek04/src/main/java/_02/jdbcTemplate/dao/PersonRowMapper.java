package _02.jdbcTemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import _02.jdbcTemplate.model.Person;

public class PersonRowMapper implements RowMapper<Person> {


	public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		String surname = resultSet.getString("surname");
		int birthYear = resultSet.getInt("birthYear");
		
		Person person = new Person(id, name, surname, birthYear);		
		return person;
	}

}
