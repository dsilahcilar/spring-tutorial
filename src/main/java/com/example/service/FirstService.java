package com.example.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

//@Service
@Setter
@Getter
public class FirstService {
    private String name;

   // @Autowired
   // @Qualifier("fl")
    private MyLogger myLogger;

    public String say(String str) {

        myLogger.log(str);
        return "hello " + str;
    }
}
