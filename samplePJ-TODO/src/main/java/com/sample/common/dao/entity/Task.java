package com.sample.common.dao.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Task {
	private Long id; //登録番号
	
	private String username;//ユーザーネーム
	
	private String title; //タイトル
	
	private String content; //内容
	
	private String name; //登録者
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate startDate; //開始日
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate endDate; //終了日
	
	LocalDateTime createdAt; //作成日時
	
	LocalDateTime updatedAt; //更新日時

}
