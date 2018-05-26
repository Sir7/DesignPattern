package com.behavior.state;

/** 
 * @Title: AfternoonState 
 * @Description: 具体状态
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:48:09 
 *  
 */
public class AfternoonState implements State{
	
	@Override 
	public void doSomeThing() {
        System.out.println("下午学习！");
    }

}
