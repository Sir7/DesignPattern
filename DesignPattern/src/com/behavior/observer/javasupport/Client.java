package com.behavior.observer.javasupport;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:24:27 
 *  
 */
public class Client {
	
	/*
	 * 输出：
	 * 公众号更新了文章：java中对观察者模式的支持
	 * 读者查看公众号更新信息：java中对观察者模式的支持
	 */
	public static void main(String[] args) {
		CoderPig cg = new CoderPig();
		AndroidDev ad = new AndroidDev();
		cg.addObserver(ad);
		cg.update("java中对观察者模式的支持");
		cg.deleteObserver(ad);
	}

}
