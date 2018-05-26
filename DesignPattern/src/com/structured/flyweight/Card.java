package com.structured.flyweight;

/** 
 * @Title: Card 
 * @Description: Flyweight：享元对象的抽象父类或者接口，通过这个接口，享元对象可以接受并作用于外部状态；
 * @author yang.lvsen
 * @date 2018年5月26日 上午11:13:13 
 *  
 */
public abstract class Card {
	
	public abstract void showCard(String num); //传入外部状态参数，大小是内部无法控制的，而花色内部可以自主控制

}
