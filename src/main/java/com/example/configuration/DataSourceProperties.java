package com.example.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "myapp.datasource")
@Configuration
public class DataSourceProperties {
    private String url;
    private String username;
    private String password;

}
