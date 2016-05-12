package com.example.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Order {
    @Id
    private Long id;
    private String description;
    @CreatedDate
    private Date createdDate;

    @ManyToOne
    private User user;
}
