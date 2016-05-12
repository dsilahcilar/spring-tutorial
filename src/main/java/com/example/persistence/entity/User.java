package com.example.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class User {
    @Id
    private Long id;
    private String userName;
    private String name;
    private String lastName;
    @CreatedDate
    private Date createdDate;
}
