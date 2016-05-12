package com.example.service;

import org.springframework.stereotype.Service;

@Service(value = "fl")
public class FileLogger implements MyLogger {
    @Override
    public void log(String str) {
        System.out.println("Logu dosyaya yazdım " + str);
    }
}
