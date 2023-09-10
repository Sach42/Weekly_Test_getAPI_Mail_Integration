package com.sachin.GetAPIMailIntegration;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    // Define beans for the objects you want to create this is basically an objecct made by spring it self
    @Bean
    public MyObject myObject() {
        String name = "sachin";
        int age = 25;
        return new MyObject(name, age);
    }


}