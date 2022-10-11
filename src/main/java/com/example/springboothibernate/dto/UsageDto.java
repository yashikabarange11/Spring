package com.example.springboothibernate.dto;

import lombok.Data;
import java.security.Timestamp;
import java.time.LocalDateTime;

@Data
public class UsageDto {

    private Long id;
    private String reason;
    private String branch;
    private String developedBy;
    private Long createdOn;
    private Long updatedOn;
    private String duration;



}
