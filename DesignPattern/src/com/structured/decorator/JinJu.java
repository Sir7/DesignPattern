package com.structured.decorator;

/** 
 * @Title: JinJu
 * @Description: 各种配料
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:30:38
 */
public class JinJu extends Decorator{
	
	public Tea tea;
	
	public JinJu(Tea tea){
		this.tea = tea;
	}

	@Override
	public String getName() {
		return "金菊："+tea.getName();
	}

	@Override
	public int price() {
		return 1+tea.price();
	}

}
