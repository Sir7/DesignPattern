package com.structured.flyweight;

/** 
 * @Title: HeartCard 
 * @Description: 红桃
 * @author yang.lvsen
 * @date 2018年5月26日 上午11:15:25 
 *  
 */
public class HeartCard extends Card{
	
	public HeartCard(){
		super();
	}

	@Override
	public void showCard(String num) {
		System.out.println("红桃："+num);
	}

}
