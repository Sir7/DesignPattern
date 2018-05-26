package com.structured.flyweight;

/** 
 * @Title: ClubCard 
 * @Description: 梅花
 * @author yang.lvsen
 * @date 2018年5月26日 上午11:15:25 
 *  
 */
public class ClubCard extends Card{
	
	public ClubCard(){
		super();
	}

	@Override
	public void showCard(String num) {
		System.out.println("梅花："+num);
	}

}
