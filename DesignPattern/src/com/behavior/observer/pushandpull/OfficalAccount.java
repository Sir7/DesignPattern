package com.behavior.observer.pushandpull;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Title: OfficalAccount 
 * @Description: 抽象被观察者公众号
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:05:37 
 *  
 */
public class OfficalAccount {
	
	private List<User> userList = new ArrayList<>();
	
	public void register(User user){
		userList.add(user);
	}
	
	public void unregister(User user){
		userList.remove(user);
	}
	
	public void notifyUse(){
		for(User user:userList){
			user.update(this);
		}
	}

}
