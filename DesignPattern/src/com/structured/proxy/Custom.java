package com.structured.proxy;

/** 
 * @Title: Custom 
 * @Description: 真实对象，即原本真实对象需要干的活。
 * @author yang.lvsen
 * @date 2018年5月26日 下午1:15:55 
 *  
 */
public class Custom implements FetchGoods{

	@Override
	public void fetchShoes() {
		System.out.println("拿货");
	}

}
