package com.structured.decorator;

/** 
 * @Title: ZhenZhu
 * @Description: 各种配料
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:30:38
 */
public class ZhenZhu extends Decorator{
	
	public Tea tea;
	
	public ZhenZhu(Tea tea){
		this.tea = tea;
	}

	@Override
	public String getName() {
		return "珍珠："+tea.getName();
	}

	@Override
	public int price() {
		return 2+tea.price();
	}

}
