package com.example.springboothibernate.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberId;
    private String memName;
    private String emailId;
    private String role;
    private  String permissionLevel;

    @JsonIgnore
    @ManyToMany(mappedBy = "assignedMembers")
    private Set<Team> teamSet = new HashSet<>();

}
