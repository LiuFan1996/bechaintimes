package com.bechain.bean;

/**
 * �û�ʵ����
 */
public class CompanyUser {
	private int id ; 
	private String email ;
	private String name ;       //ְλ
	private String password ;
	private int userIntegral ;  //�û�����:VIP ��ͨ�û�
	private char isEmailVerify ;
	private String emailVerifyCode ;
	private long lastLoginTime ;
	private String lastLoginIp ;	
}
