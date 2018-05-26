package com.behavior.mediator;

/** 
 * @Title: Tenant 
 * @Description: 具体同事类，这里有房客
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:06:56 
 *  
 */
public class Tenant extends People{

	public Tenant(String name, Mediator mediator) {
		super(name, mediator);
	}
	
	public void contact(String msg){
		mediator.contact(this, msg);
	}
	
	public void getMessage(String msg){
		System.out.println("【房客】："+name+":"+msg);
	}

}
