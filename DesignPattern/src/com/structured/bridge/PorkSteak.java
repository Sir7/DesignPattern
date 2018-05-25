package com.structured.bridge;

/** 
 * @Title: PorkSteak
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午3:38:39
 */
public class PorkSteak extends Steak{

	public PorkSteak(Rations rations) {
		super(rations);
	}

	@Override
	public String sale() {
		return "猪扒"+(rations == null ? "" :rations.rations());
	}

}
