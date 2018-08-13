package com.theatro.api.storeapi.requests;


import java.util.Arrays;

public class TGSMessage {
    private long timeStamp;
    private String transId;
    private int storeId;
    private String originator;
    private String processInTAG;
    private String[] targetSubSystems;
    private TgsApiInterface tgsApiInterface=new TgsApiInterface();
    private TagApiInterface tagApiInterface=new TagApiInterface();


    public static class TgsApiInterface{
        private String serviceType;
        private String service;
        private String msgType;
        private Object object;

        public String getServiceType() {
            return serviceType;
        }

        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public String getMsgType() {
            return msgType;
        }

        public void setMsgType(String msgType) {
            this.msgType = msgType;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        @Override
        public String toString() {
            return "TgsApiInterface{" +
                    "serviceType='" + serviceType + '\'' +
                    ", service='" + service + '\'' +
                    ", msgType='" + msgType + '\'' +
                    ", object=" + object +
                    '}';
        }
    }

    public static class TagApiInterface{
        private String service;
        private String action;
        private String url;
        private String localFilePath;

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getLocalFilePath() {
            return localFilePath;
        }

        public void setLocalFilePath(String localFilePath) {
            this.localFilePath = localFilePath;
        }

        @Override
        public String toString() {
            return "TagApiInterface{" +
                    "service='" + service + '\'' +
                    ", action='" + action + '\'' +
                    ", url='" + url + '\'' +
                    ", localFilePath='" + localFilePath + '\'' +
                    '}';
        }
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getOriginator() { return originator; }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public TgsApiInterface getTgsApiInterface() {
        return tgsApiInterface;
    }

    public void setTgsApiInterface(TgsApiInterface tgsApiInterface) {
        this.tgsApiInterface = tgsApiInterface;
    }

    public String getProcessInTAG() {
        return processInTAG;
    }

    public void setProcessInTAG(String processInTAG) {
        this.processInTAG = processInTAG;
    }

    public String[] getTargetSubSystems() {
        return targetSubSystems;
    }

    public void setTargetSubSystems(String[] targetSubSystems) {
        this.targetSubSystems = targetSubSystems;
    }

    public TagApiInterface getTagApiInterface() {
        return tagApiInterface;
    }

    public void setTagApiInterface(TagApiInterface tagApiInterface) {
        this.tagApiInterface = tagApiInterface;
    }


    @Override
    public String toString() {
        return "TGSMessage{" +
                "timeStamp=" + timeStamp +
                ", transId='" + transId + '\'' +
                ", storeId=" + storeId +
                ", originator='" + originator + '\'' +
                ", processInTAG='" + processInTAG + '\'' +
                ", targetSubSystem=" + Arrays.toString(targetSubSystems) +
                ", tgsApiInterface=" + tgsApiInterface +
                ", tagApiInterface=" + tagApiInterface +
                '}';
    }
}

