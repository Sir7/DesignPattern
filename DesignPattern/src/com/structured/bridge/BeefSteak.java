package com.structured.bridge;

/** 
 * @Title: BeefSteak
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午3:38:39
 */
public class BeefSteak extends Steak{

	public BeefSteak(Rations rations) {
		super(rations);
	}

	@Override
	public String sale() {
		return "牛扒"+(rations == null ? "" :rations.rations());
	}

}
