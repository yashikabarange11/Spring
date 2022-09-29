package com.example.springboothibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "InstanceUsage")
public class Usage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String branchName;
    private String reason;

    @ManyToOne
    @JoinColumn(name = "fkInstanceId")
    private Instance instance;

    @ManyToOne
    @JoinColumn(name = "fkuserId")
    private Member member;

}
