package com.structured.flyweight;

/** 
 * @Title: Client 
 * @Description: 发牌
 * @author yang.lvsen
 * @date 2018年5月26日 上午11:26:58 
 *  
 */
public class Client {
	
	//模拟发十张牌
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			Card card = null;
			
			//随即花色
			switch((int)(Math.random()*4)){
				case 0: card = PokerFactory.getPoker(PokerFactory.Spade);break;
				case 1: card = PokerFactory.getPoker(PokerFactory.Heart);break;
				case 2: card = PokerFactory.getPoker(PokerFactory.Club);break;
				case 3: card = PokerFactory.getPoker(PokerFactory.Diamond);break;
			}
			
			if(card != null){
				//随机大小
				int num = (int)(Math.random()*13+1);
				switch(num){
					case 11:card.showCard("J");break;
					case 12:card.showCard("Q");break;
					case 13:card.showCard("K");break;
					default:card.showCard(num+"");break;
				}
			}
		}
	}

}
