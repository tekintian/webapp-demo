package cn.tekin;

import java.net.HttpURLConnection;
import java.net.URL;

public class UrlHelper{
	
	/*
	 * 获取指定连接并返回状态码
	 */
	public static int checkUrl(String inputurl){
		
		try {
			//打开inputurl连接, 并强转为HttpURLConnection
			HttpURLConnection connection = (HttpURLConnection)new URL(inputurl).openConnection();
			//获取连接状态码
			int respCode = connection.getResponseCode();
			
			//return respCode==404 ? false : true;
			
			//直接返回状态码
			return respCode;

		} catch (Exception e) {

			e.printStackTrace();
			return 0;

		}
		
	}

}
