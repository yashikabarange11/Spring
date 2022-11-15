package com.example.springboothibernate.entity;



import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "InstanceUsage")
public class Usage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String branchName;
    private String reason;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;


    @ManyToOne
    @JoinColumn(name = "fkInstanceId")
    private Instance instance;

    @ManyToOne
    @JoinColumn(name = "fkuserId")
    private Member member;


}
