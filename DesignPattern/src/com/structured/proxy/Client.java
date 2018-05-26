package com.structured.proxy;

/** 
 * @Title: Client 
 * @Description: 客户端测试
 * @author yang.lvsen
 * @date 2018年5月26日 下午1:21:10 
 *  
 */
public class Client {
	
	/*
	 * 客户只需要调用代理对象，让代理对象干原本是自己干的活，无须自己调用该方法。
	 */
	public static void main(String[] args) {
		Agent a = new Agent();
		a.fetchShoes();
	}

}
