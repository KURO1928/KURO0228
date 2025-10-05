package com.sample.common.dao.entity;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class User {
	private Long id; //登録番号
	
	@Pattern(regexp = "^[a-zA-Z]+$",message = "ユーザー名は半角英字で入力してください。")
	private String username; //ユーザーネーム
	
	@Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+$",message = "パスワードは半角英数字で入力してください。")
	private String password; //パスワード
	
	LocalDateTime createdAt; //作成日時
	
	LocalDateTime updatedAt; //更新日時
	
}
