package com.structured.flyweight;

/** 
 * @Title: SpadeCard 
 * @Description: 黑桃。ConcreteFlyweight：具体享元实现对象，继承或实现Flyweight并为内部状态增加存储空间。
 * @author yang.lvsen
 * @date 2018年5月26日 上午11:15:25 
 *  
 */
public class SpadeCard extends Card{
	
	public SpadeCard(){
		super();
	}

	@Override
	public void showCard(String num) {
		System.out.println("黑桃："+num);
	}

}
