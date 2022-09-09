package com.example.springboothibernate.controller;

import com.example.springboothibernate.entity.Team;
import com.example.springboothibernate.service.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamServiceImpl teamService;

    @PostMapping("/save")
    public ResponseEntity<Team> saveTeam(@RequestBody Team teamObj){
        teamService.saveTeam(teamObj);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getTeam", "/{teamId}"})
    public List<Team> getTeam(
            @PathVariable(required = false) Long teamId
    ){
        return  teamService.getTeamDetails(teamId);
    }

    @DeleteMapping("delete/{teamId}")
    public ResponseEntity removeTeam(@PathVariable Long teamId){
        teamService.deleteTeam(teamId);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{teamId}/member/{memId}")
    public Team assignedMemberToTeam(
            @PathVariable Long teamId,
            @PathVariable Long memId
    ){
        return teamService.assignMemberToTeam(teamId, memId);
    }
}
