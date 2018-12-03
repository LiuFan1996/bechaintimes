package com.bechain.util;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class MD5Util {
	/**
	 * MD5加密方法
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static String encode(String str) throws Exception{
		//MD5处理
		MessageDigest md = 
			MessageDigest.getInstance("MD5");
		byte[] dest = md.digest(str.getBytes());
		//Base64处理
		BASE64Encoder base64 = new BASE64Encoder();
		return base64.encode(dest);
	}
}
