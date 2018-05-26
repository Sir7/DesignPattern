package com.behavior.visitor;

/** 
 * @Title: FemalePlayer 
 * @Description: 具体访问者
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:34:45 
 *  
 */
public class FemalePlayer implements Player{
	
	@Override 
	public void visit(Shooting machine) {
        System.out.println("女性玩家玩：" + machine.feature());
    }

    @Override 
    public void visit(Dancing machine) {
        System.out.println("女性玩家玩：" + machine.feature());
    }

    @Override 
    public void visit(Driving machine) {
        System.out.println("女性玩家玩：" + machine.feature());
    }

}
