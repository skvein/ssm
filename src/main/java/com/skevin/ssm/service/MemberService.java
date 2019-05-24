package com.skevin.ssm.service;


import com.skevin.ssm.dto.MemberRegisterDTO;

/**
 * 会员管理接口类
 */
public interface MemberService {
    Boolean register(MemberRegisterDTO param);
}
