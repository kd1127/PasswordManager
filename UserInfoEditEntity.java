package com.example.entity;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/*
 * ログインアカウント編集情報格納エンティティ
 */

@Data
public class UserInfoEditEntity {
	@NotBlank
	private String userId;
	
	@NotBlank
	private String passWd;
	
	@NotBlank
	private String re_PassWd;
	
	@NotBlank
	private String passKey;
	
	private Date inp_date;
}
