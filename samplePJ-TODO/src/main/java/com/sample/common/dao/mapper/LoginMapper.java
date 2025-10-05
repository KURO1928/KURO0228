package com.sample.common.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sample.common.dao.entity.Login;

@Mapper
public interface LoginMapper {
	
	
	// ユーザー名を検索する
	@Select("SELECT id, username, password, created_at, updated_at FROM login WHERE username = #{username}")
    Login findByUserName(String username);
	
	
	
}
