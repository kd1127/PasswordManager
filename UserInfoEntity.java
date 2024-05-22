package com.example.entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;	

/*
 * ログイン用情報格納クラス
 */

@Data
@Component
public class UserInfoEntity {
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
