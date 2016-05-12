package com.example.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    private String userName;
    private String name;
    private String lastName;
    @CreatedDate
    private Date createdDate;

    @OneToMany
    private List<Order> orders;
}
