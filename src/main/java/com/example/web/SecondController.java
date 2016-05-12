package com.example.web;

import com.example.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/second")
public class SecondController {

    @Autowired
    private FirstService firstService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path = "/")
    public String first() {
        System.out.println(firstService);
        firstService.setName("ahmet");
        System.out.println("firstService.getName() = " + firstService.getName());
        return firstService.say("deniz");
    }


}
