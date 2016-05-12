package com.example.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Setter
@Getter
public class SecondService {
    private String name;

    @Autowired
    @Qualifier("dataBaseLogger")
    private MyLogger myLogger;

    public String walk(String str) {
        myLogger.log(str);
        return "i am walking  " + str;
    }
}
