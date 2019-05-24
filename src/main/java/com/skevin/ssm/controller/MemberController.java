package com.skevin.ssm.controller;


import com.skevin.ssm.dto.MemberRegisterDTO;
import com.skevin.ssm.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 会员管理controller
 */
@RequestMapping("/v1/member")
@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    /**
     * 用户注册
     * @param param
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Boolean register(@RequestBody MemberRegisterDTO param){
        return this.memberService.register(param);
    }
}
