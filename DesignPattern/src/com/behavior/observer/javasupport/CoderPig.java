package com.behavior.observer.javasupport;

import java.util.Observable;

/** 
 * @Title: CoderPig 
 * @Description: 具体被观察者CoderPig公众号
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:09:29 
 * 口诀：被观察者   实现    继承Observable，观察者   实现    Observer接口 
 */
public class CoderPig extends Observable{
	
	private String msg;
	
	public String getMsg(){
		return msg;
	}
	
	public void update(String msg){
		this.msg = msg;
		System.out.println("公众号更新了文章："+msg);
		this.setChanged();//这句必不可少，通知改变
		this.notifyObservers(this.msg);	//这里用推的方式
	}

}
