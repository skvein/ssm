package com.skevin.ssm.mapper;

import com.skevin.ssm.dto.MemberRegisterDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    Long insert(MemberRegisterDTO param);
}
