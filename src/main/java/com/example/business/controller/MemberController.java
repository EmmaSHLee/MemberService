package com.example.business.controller;

import com.example.business.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired //MemberController 생성될 때 등록되어 있는 MemberService 객체를 가져옴
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
