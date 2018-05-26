package com.behavior.state;

/** 
 * @Title: MorningState 
 * @Description: 具体状态
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:47:29 
 *  
 */
public class MorningState implements State{
	
	@Override 
	public void doSomeThing() {
        System.out.println("早上赖床！");
    }

}
