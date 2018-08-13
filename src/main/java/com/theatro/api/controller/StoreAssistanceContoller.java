package com.theatro.api.controller;


import com.theatro.api.response.AssistanceResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="Request Assistance API", description="API to place an assistance Request in Store")
public class StoreAssistanceContoller {
    public static final Logger LOGGER= LoggerFactory.getLogger(StoreAssistanceContoller.class);


    @ApiOperation(value = "Place an Assistance Request to an Department in a Store", response = AssistanceResponse.class,responseContainer = "List")
    @RequestMapping(value = "storeassist",method = RequestMethod.POST,produces = "application/json")
    public AssistanceResponse requestAssistance (@RequestParam("chain") String chain,@RequestParam("store")String name, @RequestParam("department")String department){

        AssistanceResponse assistanceResponse = null;

        return assistanceResponse;
    }





}
