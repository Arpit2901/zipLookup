package com.bhavna.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bhavna.bean.Department;
import com.bhavna.bean.Employee;
import com.bhavna.utility.MyConnection;

public class Operations {
	public void fetchData() {
		Connection connection = MyConnection.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("select * from employee e inner join department d on e.employeeId = d.employeeId;");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getDouble(3)
						+ "\t" + resultSet.getString(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getString(6));
			}
		} catch (Exception e) {
			System.out.println("excep" + e);
		}
	}

	public static void insertEmpData(Employee emp) {
		try {
			Connection connection = MyConnection.getConnection();
			String query = "insert into employee(employeeId,employeeName,employeeSalry,joiningDate ) values(?,?,?,?)";

			PreparedStatement pstmnt = connection.prepareStatement(query);

			pstmnt.setInt(1, emp.getEmployeeId());
			pstmnt.setString(2, emp.getEmployeeName());
			pstmnt.setDouble(3, emp.getEmployeeSalry());
			pstmnt.setDate(4, (Date) emp.getJoiningDate());

			pstmnt.executeUpdate();
			System.out.println("Data inserted successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void insertDepData(Department dep) {
		try {
			Connection connection = MyConnection.getConnection();
			String query = "insert into department values(?,?,?);";

			PreparedStatement pstmnt = connection.prepareStatement(query);

			pstmnt.setInt(1, dep.getDepartmentId());
			pstmnt.setString(2, dep.getDepartmentName());
			pstmnt.setDouble(3, dep.getEmployeeId());
	

			pstmnt.executeUpdate();
			System.out.println("Data inserted successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateEmployeeData(Employee emp) {
		try {
			Connection con=MyConnection.getConnection();
			String query="update employee set employeeName=?, joiningDate=?,employeeSalry=? where employeeID=?";
			PreparedStatement pstmnt=con.prepareStatement(query);
			pstmnt.setString(1, emp.getEmployeeName());
			pstmnt.setDate(2, emp.getJoiningDate());
			pstmnt.setDouble(3, emp.getEmployeeSalry());
			pstmnt.setInt(4, emp.getEmployeeId());
			pstmnt.execute();
			System.out.println("Employee data has been updated");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void employeesAbove30K() {
		try {
			Connection con=MyConnection.getConnection();
			
            Statement statement = con.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select d.dep_Name, count(*) from department d inner join employee e on e.employeeId=d.employeeId where e.salary > 30000 group by d.employeeId;");
            while(resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
            }

        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
}
