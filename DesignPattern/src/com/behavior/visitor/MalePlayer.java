package com.behavior.visitor;

/** 
 * @Title: MalePlayer 
 * @Description: 具体访问者
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:34:14 
 *  
 */
public class MalePlayer implements Player{
	
	@Override 
	public void visit(Shooting machine) {
        System.out.println("男性玩家玩：" + machine.feature());
    }

    @Override 
    public void visit(Dancing machine) {
        System.out.println("男性玩家玩：" + machine.feature());
    }

    @Override 
    public void visit(Driving machine) {
        System.out.println("男性玩家玩：" + machine.feature());
    }

}
