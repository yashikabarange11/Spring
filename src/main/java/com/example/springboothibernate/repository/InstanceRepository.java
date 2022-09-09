package com.example.springboothibernate.repository;

import com.example.springboothibernate.entity.Instance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstanceRepository extends JpaRepository<Instance, Long> {
    List<Instance> findAllById(Long id);
}
