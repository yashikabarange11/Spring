package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Member;

import java.util.List;

public interface MemberService {
    void saveMember(Member memObj);

    List<Member> getMemberDetails(Long memberId);

    void deleteMember(Long memberId);
}
