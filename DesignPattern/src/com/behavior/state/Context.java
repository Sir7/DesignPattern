package com.behavior.state;

/** 
 * @Title: Context 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:49:03 
 *  
 */
public class Context {
	
	public void setState(State state) {
        System.out.println("状态改变");
        state.doSomeThing();
    }

}
