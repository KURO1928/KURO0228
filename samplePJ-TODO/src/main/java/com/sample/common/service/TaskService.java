package com.sample.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.common.dao.entity.Task;
import com.sample.common.dao.mapper.TaskMapper;

@Service
public class TaskService {

	private static final int PAGE_SIZE = 10;
	@Autowired
	private TaskMapper taskMapper;

	public void createTask(Task task) {
		taskMapper.insertTask(task); // Taskオブジェクトをそのまま渡す
	}

	// 追加: 全てのタスクを返すメソッド
	public List<Task> findAllTasks() {
		return taskMapper.findAll();
	}

	public Task findById(Long id) {
		// TODO 自動生成されたメソッド・スタブ
		return taskMapper.findById(id);
	}

	public void updateTask(Task task) {
		taskMapper.updateTask(task);
	}

	public List<Task> findPage(int page) {
		int offset = (page - 1) * PAGE_SIZE;
		return taskMapper.findPage(PAGE_SIZE, offset);
	}

	public int getTotalPages() {
		int total = taskMapper.countAll();
		return (int) Math.ceil((double) total / PAGE_SIZE);
	}

	public void deleteTask(Long id) {
		taskMapper.deleteById(id);
	}

}
