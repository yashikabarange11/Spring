package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Member;
import com.example.springboothibernate.entity.Team;
import com.example.springboothibernate.repository.MemberRepository;
import com.example.springboothibernate.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MemberRepository memberRepository;

    public void saveTeam(Team teaObj){
        teamRepository.save(teaObj);
    }

    public List<Team>getTeamDetails(Long teamId){
        if(null!=teamId){
            return teamRepository.findAllByTeamId(teamId);
        }else{
            return teamRepository.findAll();
        }
    }

    public  void deleteTeam(Long teamId){
        teamRepository.deleteById(teamId);
    }

    public Team assignMemberToTeam(Long teamId, Long memId){
        Set<Member>memberSet = null;
        Team team = teamRepository.findById(teamId).get();
        Member member = memberRepository.findById(memId).get();
        memberSet = team.getAssignedMembers();
        memberSet.add(member);
        team.setAssignedMembers(memberSet);
        return  teamRepository.save(team);
    }
}
