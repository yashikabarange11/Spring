package com.example.springboothibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Instance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String insName;
    private String insId;

    @ManyToOne
    @JoinColumn(name = "fkEmpId")
    private Team team;
}
