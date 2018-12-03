package com.bechain.bean;

/**
 * 用户实体类
 */
public class CompanyUser {
	private int id ; 
	private String email ;
	private String name ;       //职位
	private String password ;
	private int userIntegral ;  //用户级别:VIP 普通用户
	private char isEmailVerify ;
	private String emailVerifyCode ;
	private long lastLoginTime ;
	private String lastLoginIp ;	
}
