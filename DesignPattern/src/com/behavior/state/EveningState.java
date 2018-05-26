package com.behavior.state;

/** 
 * @Title: EveningState 
 * @Description: 具体状态
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:48:35 
 *  
 */
public class EveningState implements State{
	
	@Override 
	public void doSomeThing() {
        System.out.println("晚上打球！");
    }

}
