package com.structured.decorator;

/** 
 * @Title: YeGuo
 * @Description: 各种配料
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:30:38
 */
public class YeGuo extends Decorator{
	
	public Tea tea;
	
	public YeGuo(Tea tea){
		this.tea = tea;
	}

	@Override
	public String getName() {
		return "椰果："+tea.getName();
	}

	@Override
	public int price() {
		return 2+tea.price();
	}

}
