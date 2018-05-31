package com.theatro.api.dao;

import com.theatro.api.dbutils.DatabaseUtil;
import com.theatro.api.response.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao {

    public static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);

    @Autowired
    DatabaseUtil databaseUtil;

    private JdbcTemplate bizJdbcTemplate;

    @Autowired
    public void setBizJdbcTemplate(@Qualifier("bizDatasource") DataSource bizDatasource) {
        this.bizJdbcTemplate = new JdbcTemplate(bizDatasource);
    }


    public Employee getEmployeeDetails(String fullName){
        Employee employee = null;
        String SQL = "SELECT firstname,lastname,tagoutname from employees where tagoutname=?";
        bizJdbcTemplate.query(SQL,new Object[]{fullName},new ResultSetExtractor<Employee>() {
            @Override
            public Employee extractData(ResultSet resultSet) throws SQLException, DataAccessException {

                while (resultSet.next()) {
                    employee.setFirstName(resultSet.getString("firstname"));
                    employee.setLastName(resultSet.getString("lastname"));
                }
                return employee;
            }
        });
        return employee;
    }


    public List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();
        String SQL = "SELECT firstname,lastname,tagoutname from employees";
        bizJdbcTemplate.query(SQL,new ResultSetExtractor<List<Employee>>() {
            @Override
            public List<Employee> extractData(ResultSet resultSet) throws SQLException, DataAccessException {

                while (resultSet.next()) {
                    Employee employee = new Employee();
                    employee.setFirstName(resultSet.getString("firstname"));
                    employee.setLastName(resultSet.getString("lastname"));
                    employeeList.add(employee);
                }
                return employeeList;
            }
        });
        return employeeList;
    }
}
