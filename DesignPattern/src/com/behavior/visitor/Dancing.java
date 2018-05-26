package com.behavior.visitor;

/** 
 * @Title: Dancing 
 * @Description: 具体元素，跳舞机
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:33:06 
 *  
 */
public class Dancing implements Machine{
	
	@Override 
	public void accept(Player player) {
        player.visit(this);
    }

    public String feature() {
        return "跳舞机";
    }

}
