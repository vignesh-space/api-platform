package com.theatro.api.controller;

import com.theatro.api.response.Employee;
import com.theatro.api.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;



@RestController
@Api(value="Employee API", description="API for In store Employee")
public class EmployeeController {

    public static final Logger LOGGER= LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "Get All employees in a store", response = Employee.class,responseContainer = "List")
    @RequestMapping(value = "/employee",method = RequestMethod.GET,produces = "application/json")
    public Iterable<Employee> fetchEmployeeList(@RequestParam("store")String storename){
        return employeeService.fetchEmployeeList( storename);
    }


    @ApiOperation(value = "Get the Details of an employee in a store", response = Employee.class)
    @RequestMapping(value = "employee/{fullname}",method = RequestMethod.GET,produces = "application/json")
    public Employee getEmployee(@PathVariable("fullname") String fullanme , @RequestParam("store") String storename ){
        LOGGER.info("Fetching details of employee < {} > for store < {} > ",fullanme,storename);
        Employee employee = employeeService.getEmployee(fullanme,storename);
        return employee;
    }

}
