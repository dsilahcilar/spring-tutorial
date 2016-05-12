package com.example.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Setter
@Getter
public class FirstService {
    private String name;

    public String say(String str) {
        return "hello " + str;
    }
}
