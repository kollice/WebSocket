package com.kollice.websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Created by kollice on 2016/4/8.
 */
@Controller
public class ChatController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal,String msg) throws Exception {
        if("baijianye".equals(principal.getName())) {
            simpMessagingTemplate.convertAndSendToUser("bjy","/queue/notifications",principal.getName() + "-send:" + msg);
        }
        if ("bjy".equals(principal.getName())) {
            simpMessagingTemplate.convertAndSendToUser("baijianye","/queue/notifications",principal.getName() + "-send:" + msg);
        }
    }
}
