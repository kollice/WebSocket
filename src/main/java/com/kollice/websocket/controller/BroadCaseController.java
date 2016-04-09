package com.kollice.websocket.controller;

import com.kollice.websocket.Message.BroadCaseResponse;
import com.kollice.websocket.Message.BroadCastMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by kollice on 2016/4/8.
 */
@Controller
public class BroadCaseController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public BroadCaseResponse welcome(BroadCastMessage message) throws Exception {
        Thread.sleep(3000);
        return new BroadCaseResponse("welcome," + message.getName() + "!");
    }
}
