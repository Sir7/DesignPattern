package com.behavior.observer;

/** 
 * @Title: Plant 
 * @Description: 抽象被观察者 —— 植物类，注册，移除，通知观察者
 * @author yang.lvsen
 * @date 2018年5月26日 下午2:25:48 
 *  
 */
public interface Plant {

	public void registerInsect(Insect insect);
	
	public void unregisterInsect(Insect insect);
	
	public void notifyInsect(boolean isOpen);
	
}
