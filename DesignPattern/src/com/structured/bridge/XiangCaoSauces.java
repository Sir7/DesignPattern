package com.structured.bridge;

/** 
 * @Title: XiangCaoSauces
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午3:38:39
 */
public class XiangCaoSauces extends Sauces{

	public XiangCaoSauces(Steak steak) {
		super(steak);
	}

	@Override
	public String sauces() {
		return steak.sale()+"加香草汁";
	}

}
