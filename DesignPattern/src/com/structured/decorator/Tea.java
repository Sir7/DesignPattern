package com.structured.decorator;

/** 
 * @Title: Tea
 * @Description: 抽象茶的父类
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:23:00
 */
public abstract class Tea {
	
	private String name = "茶";
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public abstract int price();
	
}
