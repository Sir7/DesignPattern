package com.structured.bridge;

/** 
 * @Title: Steak
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午3:36:11
 */
public abstract class Steak {
	
	public Rations rations;
	
	public Steak(Rations rations) {
		this.rations = rations;
	}

	public abstract String sale();
}
