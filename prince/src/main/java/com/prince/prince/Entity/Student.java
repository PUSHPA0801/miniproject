package com.prince.prince.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table (name = "STUDENT")
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    @Id
    @Column(name ="ID")
    @GeneratedValue 
    private int id;

    @Column(name ="MAIL ID")
    private String email;

    @Column(name ="PASSWORD")
    private String password;
}

