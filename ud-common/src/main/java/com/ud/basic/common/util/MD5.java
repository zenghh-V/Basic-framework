package com.ud.basic.common.util;

import java.security.MessageDigest;
/** 
 * ˵����MD5����
 * �����ˣ�FH Q313596790
 * �޸�ʱ�䣺2014��9��20��
 * @version
 */
public class 	MD5 {

	public static String md5(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			str = buf.toString();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return str;
	}
//	public static void main(String[] args) {
//		//System.out.println(md5("31119@qq.com"+"123456"));
//		//System.out.println(md5("mj1"));
//		System.out.println(md5("1234qwer"));
//	}
}
