package com.sample.common.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sample.common.dao.entity.Task;

@Mapper
public interface TaskMapper {

	// 新規タスクをデータベースに挿入
	@Insert("INSERT INTO tasks (title, content, username, name, start_date, end_date, created_at, updated_at) "
			+ "VALUES (#{title}, #{content}, #{username}, #{name}, #{startDate}, #{endDate}, now(), now())")
	void insertTask(Task task);

	@Update("UPDATE tasks " + "SET title = #{title}, " + "    content = #{content}, " + "    username = #{username}, "
			+ "    name = #{name}, " + "    start_date = #{startDate}, " + "    end_date = #{endDate}, "
			+ "    updated_at = now() " + "WHERE id = #{id}")
	void updateTask(Task task);

	@Delete("DELETE FROM tasks WHERE id = #{id}")
	void deleteById(Long id);

	@Select("SELECT * FROM tasks WHERE id = #{id}")
	Task findById(Long id);

	// 追加: 全てのタスクをデータベースから取得するメソッド
	@Select("SELECT * FROM tasks ORDER BY created_at DESC")
	List<Task> findAll();

	@Select("""
			    SELECT *
			    FROM tasks
			    ORDER BY created_at DESC
			    LIMIT #{limit} OFFSET #{offset}
			""")
	List<Task> findPage(@Param("limit") int limit, @Param("offset") int offset);

	// 全件数取得
	@Select("SELECT COUNT(*) FROM tasks")
	int countAll();
}