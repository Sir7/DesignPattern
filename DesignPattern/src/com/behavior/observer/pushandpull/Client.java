package com.behavior.observer.pushandpull;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:13:21 
 *  
 */
public class Client {
	
	public static void main(String[] args) {
		OfficalAccount oa = new CoderPig();
		//拉的模式就那么简单，就是通知观察者更新的时候，把对应引用也传过去，然后观察者要什么查什么而已。
		User user = new AndroidDev();
		oa.register(user);
		((CoderPig)oa).update("观察者模式");
		oa.unregister(user);
	}

}
