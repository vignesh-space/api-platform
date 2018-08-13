package com.theatro.api.storeapi.requests;

public class RnrRequest {
    public enum TargetType {
        EMPLOYEE,GROUP,LOCATION
    }
    String chainName;
    String storeName;
    RnrRequest.Target rnrTarget;
    String originator;

    public static class Target{
        String name;
        TargetType targetType;
        public Target(String name, TargetType targetType){
            this.name=name;
            this.targetType= targetType;
        }
    }

    public String getChainName() {
        return this.chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public RnrRequest.Target getRnrTarget() {
        return this.rnrTarget;
    }

    public void setRnrTarget(RnrRequest.Target rnrTarget) {
        this.rnrTarget = rnrTarget;
    }

    public String getOriginator() {
        return this.originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }
}
