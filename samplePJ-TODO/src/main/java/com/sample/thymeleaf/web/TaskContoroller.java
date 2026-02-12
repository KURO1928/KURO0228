package com.sample.thymeleaf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.common.dao.entity.Task;
import com.sample.common.service.TaskService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TaskContoroller {

	@Autowired
	private TaskService taskService;

	// 新規タスク作成画面を表示
	@GetMapping("/new")
	public String formNew(@ModelAttribute Task task) {
		return "tasks/form-new";
	}

	// タスク編集画面を表示
	@GetMapping("/edit/{id}")
	public String formEdit(@PathVariable Long id, Model model) {
		Task task = taskService.findById(id);
		model.addAttribute("task", task);
		return "tasks/form-edit";
	}

	// 編集画面表示
	@PostMapping("/update")
	public String update(@ModelAttribute Task task) {
		log.info("Update Task: {}", task);
		taskService.updateTask(task);
		return "redirect:/tasks";
	}

	@PostMapping("/tasks")
	public String tasks(@ModelAttribute Task task) {
		// ユーザーネームをここで設定
		// HTMLフォームにないため、コントローラーで必須の値を補完する
		task.setUsername("default_user");

		log.info("Task:{}", task);
		taskService.createTask(task);
		return "redirect:/tasks";
	}

	@PostMapping("/tasks/delete/{id}")
	public String delete(@PathVariable Long id) {
		taskService.deleteTask(id);
		return "redirect:/tasks";
	}

	@GetMapping("/tasks")
	public String tasks(@RequestParam(defaultValue = "1") int page, Model model) {

		model.addAttribute("tasks", taskService.findPage(page));
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", taskService.getTotalPages());

		return "tasks/list";
	}

}
