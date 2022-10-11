package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Usage;

import java.util.List;

public interface UsageService {

    void saveUsage(Usage usageObj);

    List<Usage>getUsageDetails(Long id);

}
