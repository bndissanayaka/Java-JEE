package com.wisdom.demo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate nmparajdbcTemplate;
	
	private DataSource dataSource;
	
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public NamedParameterJdbcTemplate getNmparajdbcTemplate() {
		return nmparajdbcTemplate;
	}

	public void setNmparajdbcTemplate(NamedParameterJdbcTemplate nmparajdbcTemplate) {
		this.nmparajdbcTemplate = nmparajdbcTemplate;
	}
	/*
	 * public Boolean saveEmployeeByPreparedStatement(final Employee e) { String
	 * query = "insert into employee values(?,?,?)"; return
	 * jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
	 * 
	 * @Override public Boolean doInPreparedStatement(PreparedStatement ps)
	 * throws SQLException, DataAccessException { ps.setInt(1, e.getId());
	 * ps.setString(2, e.getName()); ps.setDouble(3, e.getSalary()); return
	 * ps.execute(); } }); }
	 */

	public List<Employee> getAllData() {
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				while (rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getDouble(3));
					list.add(e);
				}
				return list;
			}
		});
	}

	public List<Employee> getDataRawMapper() {
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNo) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getDouble(3));

				return e;
			}
		});
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void save(Employee e) {
		String query = "insert into employee values (:id,:name,:salary)";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", e.getId());
		map.put("name", e.getName());
		map.put("salary", e.getSalary());
		
	//	NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		
		nmparajdbcTemplate.execute(query, map, new PreparedStatementCallback() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}

}
