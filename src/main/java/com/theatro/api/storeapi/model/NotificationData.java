package com.theatro.api.storeapi.model;

public class NotificationData {
    private String action;
    private String orderId;
    private int orderType;
    private int targetGroupId;
    private String playMessage;
    private String locationId;
    private String buttonId;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public int getTargetGroupId() {
        return targetGroupId;
    }

    public void setTargetGroupId(int targetGroupId) {
        this.targetGroupId = targetGroupId;
    }

    public String getPlayMessage() {
        return playMessage;
    }

    public void setPlayMessage(String playMessage) {
        this.playMessage = playMessage;
    }


    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    @Override
    public String toString() {
        return "NotificationData{" +
                "action='" + action + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderType=" + orderType +
                ", targetGroupId=" + targetGroupId +
                ", playMessage='" + playMessage + '\'' +
                ", locationId='" + locationId + '\'' +
                ", buttonId='" + buttonId + '\'' +
                '}';
    }
}
