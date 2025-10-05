package com.sample.common.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.sample.common.dao.entity.User;

@Mapper
public interface UserMapper {

    // ユーザー名とパスワードをデータベースに挿入するメソッド
	@Insert("INSERT INTO login(username, password, created_at, updated_at)VALUES(#{username}, #{password}, NOW(), NOW())")
	 @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);
    
    // ユーザーを検索する
    @Select("SELECT id, username, password, created_at, updated_at FROM login WHERE username = #{username}")
    User findByUserName(String username);
    
}