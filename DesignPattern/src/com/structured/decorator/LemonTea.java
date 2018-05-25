package com.structured.decorator;

/** 
 * @Title: LemonTea
 * @Description: 定义基本茶品，奶茶和柠檬茶
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:26:55
 */
public class LemonTea extends Tea{
	
	public void LemonTea(){
		setName("柠檬茶");
	}
	
	@Override
	public int price(){
		return 3;
	}

}
