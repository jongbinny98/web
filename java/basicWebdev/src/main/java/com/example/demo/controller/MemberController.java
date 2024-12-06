package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//create an object in the spring container
@Controller
public class MemberController {
    // don't want to create member service since it can potentially be used by many controllers
//    private final MemberService memberService = new MemberService();
    private final MemberService memberService;

    /**
     * autowire allow to bring member service from sprint container
     * @param memberService
     */
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
