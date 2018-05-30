package com.theatro.api.response;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Theatro generated Employee ID")
    private String employeeId;

    @ApiModelProperty(notes="First Name of the Employee",required = true)
    private String firstName;

    @ApiModelProperty(notes="First Name of the Employee",required = false)
    private String middleName;


    @ApiModelProperty(notes="First Name of the Employee",required = true)
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
