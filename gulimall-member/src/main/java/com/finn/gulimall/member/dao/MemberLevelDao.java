package com.finn.gulimall.member.dao;

import com.finn.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author finn
 * @email shifanfinn@gmail.com
 * @date 2022-04-25 23:06:00
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
