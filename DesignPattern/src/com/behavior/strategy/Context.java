package com.behavior.strategy;

/** 
 * @Title: Context 
 * @Description: 上下文对象，负责与具体的策略类交互
 * @author yang.lvsen
 * @date 2018年5月26日 下午1:56:09 
 *  
 */
public class Context {
	
	private Compute compute;
	
	public Context(){
		compute = new Add();
	}
	
	public void setCompute(Compute compute){
		this.compute = compute;
	}
	
	public void calc(int first,int second){
		System.out.println(compute.compute(first, second));
	}

}
