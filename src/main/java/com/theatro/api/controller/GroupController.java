package com.theatro.api.controller;

import com.theatro.api.response.Employee;
import com.theatro.api.response.Group;
import com.theatro.api.service.EmployeeService;
import com.theatro.api.service.GroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
@Api(value="Department API", description="API to work on Departments in Store")

public class GroupController {

    public static final Logger LOGGER= LoggerFactory.getLogger(GroupController.class);

    @Autowired
    private GroupService groupService;

    @ApiOperation(value = "Get All Departments in a store", response = List.class )
    @RequestMapping(value = "/department/",method = RequestMethod.GET,produces = "application/json")
    public Iterable<Group> listDepartments(){
        return groupService.listGroups();
    }


    @ApiOperation(value = "Get the Details of an employee in a store", response = Group.class)
    @RequestMapping(value = "/department/id",method = RequestMethod.GET,produces = "application/json")
    public Group getGroup(String id){
        return groupService.getGroup(id);
    }

}
