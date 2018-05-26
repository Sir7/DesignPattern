package com.structured.flyweight;

import java.util.HashMap;
import java.util.Map;

/** 
 * @Title: PokerFactory 
 * @Description: 享元工厂，创建并管理共享的享元对象，并对外提供访问共享享元对象的接口。
 * @author yang.lvsen
 * @date 2018年5月26日 上午11:18:55 
 *  
 */
public class PokerFactory {
	
	public static final int Spade = 0;
	public static final int Heart = 1;
	public static final int Club = 2;
	public static final int Diamond = 3;
	
	public static Map<Integer,Card> pokers = new HashMap<>();
	
	public static Card getPoker(int color){
		if(pokers.containsKey(color)){
			System.out.println("对象已存在，对象复用。。。。");
			return pokers.get(color);
		}else{
			System.out.println("对象不存在，新建对象。。。");
			Card card;
			switch(color){
				case Spade: card = new SpadeCard();break;
				case Heart: card = new HeartCard();break;
				case Club: card = new ClubCard();break;
				case Diamond: card = new DiamondCard();break;
				default: card = new SpadeCard();break;
			}
			pokers.put(color, card);
			return card;
		}
	}
	
}
