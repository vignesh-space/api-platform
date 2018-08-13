package com.theatro.api.service;

import com.theatro.api.response.AssistanceResponse;
import com.theatro.api.storeapi.TriggerRnR;
import com.theatro.api.storeapi.requests.RnrRequest;
import com.theatro.api.storeapi.response.RnrResponse;
import org.springframework.stereotype.Component;

@Component
public class StoreAssistanceService {

    public AssistanceResponse triggerStoreAssitanceRequestWithDepartment(String chain, String store, String department){

        AssistanceResponse assistanceResponse = new AssistanceResponse();
        RnrResponse response = TriggerRnR.triggerNewRnR(createNewRnrRequest(chain,store,department));
        assistanceResponse.setFirstName("Michael");
        assistanceResponse.setLastName("Davis");
        assistanceResponse.setLocation("Front End");
        assistanceResponse.setEmployeeImageUrl("");
        return assistanceResponse;
    }

    private RnrRequest createNewRnrRequest(String chain, String store, String department){
        RnrRequest rnrRequest = new RnrRequest();
        rnrRequest.setChainName(chain);
        rnrRequest.setStoreName(store);
        RnrRequest.Target target = new RnrRequest.Target(department,RnrRequest.TargetType.GROUP);
        rnrRequest.setRnrTarget(target);
        return rnrRequest;
    }



}
