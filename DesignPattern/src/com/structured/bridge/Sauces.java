package com.structured.bridge;

/** 
 * @Title: Sauces
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午4:17:07
 */
public abstract class Sauces {
	
	public Steak steak;
	
	public Sauces(Steak steak) {
		this.steak = steak;
	}

	public abstract String sauces();
}
