package com.behavior.mediator;

/** 
 * @Title: Landlord 
 * @Description: 具体同事类，这里有房东
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:04:36 
 *  
 */
public class Landlord extends People{

	public Landlord(String name, Mediator mediator) {
		super(name, mediator);
	}
	
	public void contact(String msg){
		mediator.contact(this, msg);
	}
	
	public void getMessage(String msg){
		System.out.println("【房东】："+name+":"+msg);
	}

}
