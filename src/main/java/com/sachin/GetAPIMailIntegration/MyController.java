package com.sachin.GetAPIMailIntegration;

import com.sun.mail.util.logging.MailHandler;
import mailHandler.MailHandlerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

    //autowire will basically act as a connector and will help refernce variable connect to object of same type
    @Autowired
    private MyObject myObject;



    //MailHandlerBase mailHandler = new MailHandlerBase();



    //getmapping will be search for get type of search on post man and basically will get the output for us
    @GetMapping("objects")
    public String getObjects() {
        // Use the created objects
        String myObjectAsString = myObject.toString();

        // Send the objects as strings via email

        System.out.println("Starting to Send Mail..... ");

        MailHandlerBase mailHandler = new MailHandlerBase();
        mailHandler.sendMail(myObjectAsString);
        return myObjectAsString;
    }
}