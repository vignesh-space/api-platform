package com.theatro.api.service;

import com.theatro.api.dao.LocationDao;
import com.theatro.api.response.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LocationService {

    @Autowired
    LocationDao locationDao;

    public List<Location> fetchLocations(String chain,String storename ){
        return locationDao.getLocations(chain,storename);
    }

    public Location getEmployee(String locationName, String storename,String chain){
        return locationDao.getLocationDetails(locationName,storename,chain);
    }

}
