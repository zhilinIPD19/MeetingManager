package com.sg.jdbctcomplexexample.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kylerudy
 */
public class Employee {
    int id;
    String firstName;
    String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static final class EmployeeMapper implements RowMapper<Employee> {

        @Override
        public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
            Employee emp = new Employee();
            emp.setId(resultSet.getInt("id"));
            emp.setFirstName(resultSet.getString("firstName"));
            emp.setFirstName(resultSet.getString("firstName"));
            return emp;
        }
    }
}
