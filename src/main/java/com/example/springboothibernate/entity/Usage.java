package com.example.springboothibernate.entity;


import com.example.springboothibernate.dto.UsageDto;
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
    private Long createdOn;

    @UpdateTimestamp
    private Long updatedOn;

    @Transient
    private String createdOnHuman;

    @ManyToOne
    @JoinColumn(name = "fkInstanceId")
    private Instance instance;

    @ManyToOne
    @JoinColumn(name = "fkuserId")
    private Member member;

    public UsageDto usageDto(){
        UsageDto usage = new UsageDto();
        usage.setId(this.id);
        return usage;
    }
}
