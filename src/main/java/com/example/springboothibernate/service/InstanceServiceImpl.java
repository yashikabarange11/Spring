package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Instance;
import com.example.springboothibernate.repository.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstanceServiceImpl implements InstanceService {
    @Autowired
    private InstanceRepository instanceRepository;

    public void saveInstance(Instance instanceObj){
        instanceRepository.save(instanceObj);
    }

    public List<Instance> getInstanceDetails(Long id){
        if(null!= id){
            return instanceRepository.findAllById(id);
        }else{
            return  instanceRepository.findAll();
        }
    }

    public  void deleteInstance(Long id){
        instanceRepository.deleteById(id);
    }
}
