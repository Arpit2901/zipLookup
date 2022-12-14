package com.bhavna.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import com.bhavna.bean.EmployeeRecord;

public class EmployeeDao {

	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public Boolean save(EmployeeRecord employee) {
		String query = "insert into employeerecord values(?,?,?,?,?,?,?)";
		return template.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

				ps.setInt(1, employee.getEmployeeId());
				ps.setString(2, employee.getEmployeeName());
				ps.setDouble(3, employee.getEmployeeSalary());
				ps.setString(4, employee.getJoiningDate());
				ps.setInt(5, employee.getDeptId());
				ps.setString(6, employee.getDeptName());
				ps.setString(7, employee.getStatus());

				System.out.println("inserted duccessfully");
				return ps.execute();

			}
		});
	}

	public List<EmployeeRecord> getEmployee() {
//		return template.query("select * from employeerecord", new RowMapper<EmployeeRecord>() {
			return  template.query("select * from employeerecord",new Object[] {},(ResultSet resultSet, int row)->{ 
				EmployeeRecord emp = new EmployeeRecord();
				emp.setEmployeeId(resultSet.getInt(1));
				emp.setEmployeeName(resultSet.getString(2));
				emp.setEmployeeSalary(resultSet.getDouble(3));
				emp.setJoiningDate(resultSet.getString(4));
				emp.setDeptId(resultSet.getInt(5));
				emp.setDeptName(resultSet.getString(6));
				emp.setStatus(resultSet.getString(7));
				return emp;
			});
//			public EmployeeRecord mapRow(ResultSet resultSet, int row) throws SQLException {
//				EmployeeRecord emp = new EmployeeRecord();
//				emp.setEmployeeId(resultSet.getInt(1));
//				emp.setEmployeeName(resultSet.getString(2));
//				emp.setEmployeeSalary(resultSet.getDouble(3));
//				emp.setJoiningDate(resultSet.getString(4));
//				emp.setDeptId(resultSet.getInt(5));
//				emp.setDeptName(resultSet.getString(6));
//				emp.setStatus(resultSet.getString(7));
//				return emp;
			}
	
	

	  public EmployeeRecord getEmpById(int id){   
		  String sql = "SELECT * FROM employeerecord WHERE employeeid=" + id;
		  EmployeeRecord employee = template.queryForObject(sql, BeanPropertyRowMapper.newInstance(EmployeeRecord.class));
		  return employee;
	  }   

}