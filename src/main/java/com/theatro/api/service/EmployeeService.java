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

    public List<Employee> fetchEmployeeList(String chain,String storename ){
        return employeeDao.getEmployeeList(chain,storename);
    }

    public Employee getEmployee(String chain,String storename, String fullname) throws Exception{
        return employeeDao.getEmployeeDetails(chain,storename,fullname);
    }
}
