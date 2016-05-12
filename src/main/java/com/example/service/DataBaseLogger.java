package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class DataBaseLogger implements MyLogger {
    @Override
    public void log(String str) {

        System.out.println("Logu dbye yazdım " + str);
    }
}
