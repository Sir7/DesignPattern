package com.structured.bridge;

/** 
 * @Title: HeiJiaoSauces
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午3:38:39
 */
public class HeiJiaoSauces extends Sauces{

	public HeiJiaoSauces(Steak steak) {
		super(steak);
	}

	@Override
	public String sauces() {
		return steak.sale()+"加黑椒汁";
	}

}
