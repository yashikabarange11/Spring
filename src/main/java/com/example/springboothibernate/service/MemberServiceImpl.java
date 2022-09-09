package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Member;
import com.example.springboothibernate.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void saveMember(Member memObj){
        memberRepository.save(memObj);
    }

    public List<Member>getMemberDetails(Long memberId){
        if(null!= memberId){
            return  memberRepository.findAllByMemberId(memberId);
        }else{
            return memberRepository.findAll();
        }
    }

    public void deleteMember(Long memberId){
        memberRepository.deleteById(memberId);
    }
}
