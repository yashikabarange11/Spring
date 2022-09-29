package com.example.springboothibernate.repository;

import com.example.springboothibernate.entity.Usage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UsageRepository extends JpaRepository<Usage, Long> {
    List<Usage> findAllById(Long id);
}
