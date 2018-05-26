package com.behavior.visitor;

/** 
 * @Title: Driving 
 * @Description: 具体元素，开车
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:33:39 
 *  
 */
public class Driving implements Machine{
	
	@Override 
	public void accept(Player player) {
        player.visit(this);
    }

    public String feature() {
        return "开车";
    }

}
