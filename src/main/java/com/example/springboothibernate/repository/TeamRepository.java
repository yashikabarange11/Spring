package com.example.springboothibernate.repository;

import com.example.springboothibernate.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    List<Team> findAllByTeamId(Long teamId);
}
