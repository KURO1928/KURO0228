package com.sample.common.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sample.common.dao.entity.Task;

@Mapper
public interface TaskMapper {
	
    // 新規タスクをデータベースに挿入
	@Insert("INSERT INTO tasks (title, content, username, name, start_date, end_date, created_at, updated_at) " +
	        "VALUES (#{title}, #{content}, #{username}, #{name}, #{startDate}, #{endDate}, now(), now())")
	void insertTask(Task task);
	
	// 追加: 全てのタスクをデータベースから取得するメソッド
    @Select("SELECT * FROM tasks ORDER BY created_at DESC")
    List<Task> findAll();
}