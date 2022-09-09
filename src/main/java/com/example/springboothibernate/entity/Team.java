package com.example.springboothibernate.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teamId;
    private String teamName;
    private String owner;
    private String moduleOwned;

    @ManyToMany
    @JoinTable(name = "team_member",
            joinColumns = @JoinColumn(name = "team_id"),
    inverseJoinColumns = @JoinColumn(name = "mem_id")
    )
    private Set<Member>assignedMembers = new HashSet<>();
}
