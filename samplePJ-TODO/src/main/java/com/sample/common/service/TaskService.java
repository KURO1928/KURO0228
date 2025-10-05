package com.sample.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.common.dao.entity.Task;
import com.sample.common.dao.mapper.TaskMapper;

@Service
public class TaskService {
	
	@Autowired
    private TaskMapper taskMapper;

    public void createTask(Task task) {
        taskMapper.insertTask(task); // Taskオブジェクトをそのまま渡す
    }
    
    //追加: 全てのタスクを返すメソッド
    public List<Task> findAllTasks() {
        return taskMapper.findAll();
    }
	
}
