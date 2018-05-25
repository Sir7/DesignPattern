package com.structured.decorator;

/** 
 * @Title: MilkTea
 * @Description: 定义基本茶品，奶茶和柠檬茶
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:26:55
 */
public class MilkTea extends Tea{
	
	public void MilkTea(){
		setName("奶茶");
	}
	
	@Override
	public int price(){
		return 5;
	}

}
