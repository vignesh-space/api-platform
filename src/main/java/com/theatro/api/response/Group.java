package com.theatro.api.response;


import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Theatro generated ID")
    private String id;

    @ApiModelProperty(notes=" Name of the Group",required = true)
    private String name;


}
