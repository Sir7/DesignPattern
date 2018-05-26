package com.behavior.mediator;

/** 
 * @Title: People 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:03:09 
 *  
 */
public class People {
	
	protected String name;
	protected Mediator mediator;
	
	public People(String name,Mediator mediator){
		this.name = name;
		this.mediator = mediator;
	}

}
