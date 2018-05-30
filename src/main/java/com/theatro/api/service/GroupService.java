package com.theatro.api.service;

import com.theatro.api.response.Group;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GroupService {

    public List<Group> listGroups(){
        List groupList = new ArrayList<Group>();
        return groupList;
    }
    public Group getGroup(String id){
        return new Group();
    }
}
