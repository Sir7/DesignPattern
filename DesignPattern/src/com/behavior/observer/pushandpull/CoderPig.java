package com.behavior.observer.pushandpull;

/** 
 * @Title: CoderPig 
 * @Description: 具体被观察者CoderPig公众号
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:09:29 
 *  
 */
public class CoderPig extends OfficalAccount{
	
	private String msg;
	
	public String getMsg(){
		return msg;
	}
	
	public void update(String msg){
		this.msg = msg;
		System.out.println("公众号更新了文章："+msg);
		this.notifyUse();	//通知用户有更新了
	}

}
