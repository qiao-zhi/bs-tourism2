package cn.qs.utils;

import java.util.UUID;

public class UUIDUtil {
	/**
	 * 带-的UUID
	 * 
	 * @return 36位的字符串
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 去掉-的UUID
	 * 
	 * @return 32位的字符串
	 */
	public static String getUUID2() {
		return UUID.randomUUID().toString().replace("-", "");
	}

}