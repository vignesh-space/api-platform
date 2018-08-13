package com.theatro.api.storeapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.theatro.api.storeapi.model.NotificationData;
import com.theatro.api.storeapi.requests.RnrRequest;
import com.theatro.api.storeapi.requests.TGSMessage;
import com.theatro.api.storeapi.response.RnrResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriggerRnR {
    final static Logger LOGGER = LoggerFactory.getLogger(TriggerRnR.class);

    public static RnrResponse triggerNewRnR(RnrRequest rnrRequest){
        RnrResponse rnrResponse = new RnrResponse();
        TGSMessage tgsMessage =  createTGSRnrRequest(rnrRequest);
        sendRnrRequestToStore(tgsMessage);
        return rnrResponse;
    }

    static boolean sendRnrRequestToStore(TGSMessage rnr){
        boolean requestSent = false;
        NotificationData notificationData = new NotificationData();
        notificationData.setAction("request");
        return requestSent;
    }

    private static TGSMessage createTGSRnrRequest(RnrRequest rnrRequest){

        TGSMessage message = null;
        return message;
    }

}
