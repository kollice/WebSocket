package com.kollice.websocket.Message;

/**
 * Created by kollice on 2016/4/8.
 */
public class BroadCaseResponse {
    private String responseMessage;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public BroadCaseResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
