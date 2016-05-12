package com.example.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(scopeName = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Setter
@Getter
public class FirstService {
    private String name;

    public String say(String str) {
        return "hello " + str;
    }
}
