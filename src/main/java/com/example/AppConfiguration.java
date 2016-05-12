package com.example;

import com.example.service.FirstService;
import com.example.service.MyLogger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public FirstService firstService(@Qualifier("fileLogger") MyLogger logger) {
        FirstService fs = new FirstService();
        fs.setMyLogger(logger);
        return fs;
    }
}
