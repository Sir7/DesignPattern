package com.behavior.visitor;

/** 
 * @Title: Player 
 * @Description: 抽象访问者，因为有三个元素，我们写三个访问的方法，传入对应的元素实例
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:32:32 
 *  
 */
public interface Player {
	
	public void visit(Shooting machine);

    public void visit(Dancing machine);

    public void visit(Driving machine);

}
