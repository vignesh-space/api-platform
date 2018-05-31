package com.theatro.api.service;

import com.theatro.api.dao.EmployeeDao;
import com.theatro.api.response.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> fetchEmployeeList( ){
        return employeeDao.getEmployeeList();
    }

    public Employee getEmployee(String id){
        return employeeDao.getEmployeeDetails(id);
    }
}
