package com.theatro.api.service;

import com.theatro.api.response.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {
    public List<Employee> fetchEmployeeList( ){

        List <Employee> employeeList = new ArrayList<>();
        return employeeList;
    }

    public Employee getEmployee(String id){
        return new Employee();
    }
}
