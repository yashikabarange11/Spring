package com.example.springboothibernate.controller;


import com.example.springboothibernate.entity.Member;
import com.example.springboothibernate.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberServiceImpl memberService;

    @PostMapping("/save")
    public ResponseEntity createMember(@RequestBody Member memObj){
        memberService.saveMember(memObj);
        return  new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getMember", "/{memberId}"})
    public List<Member> getMembers(
            @PathVariable(required = false) Long memberId
    ){
        return memberService.getMemberDetails(memberId);
    }

    @DeleteMapping("/delete{memberId}")
    public  ResponseEntity removeMember(@PathVariable Long memberId){
        memberService.deleteMember(memberId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
