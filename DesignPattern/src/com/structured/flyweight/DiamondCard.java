package com.structured.flyweight;

/** 
 * @Title: DiamondCard 
 * @Description: 方块
 * @author yang.lvsen
 * @date 2018年5月26日 上午11:15:25 
 *  
 */
public class DiamondCard extends Card{
	
	public DiamondCard(){
		super();
	}

	@Override
	public void showCard(String num) {
		System.out.println("方块："+num);
	}

}
