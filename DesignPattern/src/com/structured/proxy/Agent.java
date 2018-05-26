package com.structured.proxy;

/** 
 * @Title: Agent 
 * @Description: 代理对象，包含对真实对象的引用从而操作真实对象，相当于对真实对象进行封装。
 * @author yang.lvsen
 * @date 2018年5月26日 下午1:17:22 
 *  
 */
public class Agent implements FetchGoods{

	@Override
	public void fetchShoes() {
		Custom c = new Custom();
		c.fetchShoes();
		callCustom();
	}
	
	public void callCustom(){
		System.out.println("叫顾客过来拿货");
	}

}
