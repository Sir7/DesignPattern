package com.behavior.visitor;

/** 
 * @Title: Shooting 
 * @Description: 具体元素，投篮机
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:32:00 
 *  
 */
public class Shooting implements Machine{
	
	@Override 
	public void accept(Player player) {
        player.visit(this);
    }

    public String feature() {
        return "投篮机";
    }

}
