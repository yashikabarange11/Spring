package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Team;

import java.util.List;

public interface TeamService {

    void saveTeam(Team teaObj);

    List<Team> getTeamDetails(Long teamId);

    void deleteTeam(Long teamId);

    Team assignMemberToTeam(Long teamId, Long memId);
}
