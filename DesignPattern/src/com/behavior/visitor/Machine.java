package com.behavior.visitor;

/** 
 * @Title: Machine 
 * @Description: 元素角色，游戏机接口，只有一个传入访问者实例的方法
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:31:17 
 *  
 */
public interface Machine {
	
	public void accept(Player player);

}
