package com.tyzx.ams.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	
	public static String getMD5(String s){
		//生成一个MD5加密计算摘要
		char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		try {
			byte[] binpit = s.getBytes();
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(binpit);
			//获得密文
			byte[] ms = md.digest();
			//把密文转换成16进制的字符串形式
			int j = ms.length;
			char str[] = new char[j*2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = ms[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
