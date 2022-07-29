package com.GenSpark.RESTFulApp_5.Controller;

import com.GenSpark.RESTFulApp_5.Service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class AppController {

    @Autowired
    private EmailSenderService senderService;

    @RequestMapping("/sendmail")
    public void sendEmail() throws MessagingException
    {
        senderService.sendEmail("*******************", "Test", "Sup");
    }
}
