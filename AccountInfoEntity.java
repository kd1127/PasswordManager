package com.example.entity;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/*
 * アカウント情報格納用クラス
 */

@Data
public class AccountInfoEntity {
	@NotBlank
	private Integer id_user;
	
	@NotBlank
	private String userId;
	
	@NotBlank
	private String passWd;
	
	private String siteName;
	
	private Date inp_date;
	
	//	0=初期値 1=ランダムパスワード方式 2=シーザー暗号方式
	private Integer situation;
}
