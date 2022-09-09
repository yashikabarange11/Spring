package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Instance;

import java.util.List;

public interface InstanceService {

    void saveInstance(Instance instanceObj);

    List<Instance> getInstanceDetails(Long id);

    void deleteInstance(Long id);
}
