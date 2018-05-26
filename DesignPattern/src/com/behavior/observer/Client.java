package com.behavior.observer;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午2:30:58 
 *  
 */
public class Client {
	
	public static void main(String[] args) {
		//创建被观察者
		Plant flower = new Flower();
		
		//创建观察者
		Insect b1 = new Bee(1);
		Insect b2 = new Bee(2);
		Insect b3 = new Bee(3);
		
		//注册观察者，观察者对被观察者做出的动作
		flower.registerInsect(b1);
		flower.registerInsect(b2);
		flower.registerInsect(b3);
		
		//改变被观察者的状态，先开后闭
		flower.notifyInsect(true);
		System.out.println("太阳落山了。。。。");
		flower.notifyInsect(false);
		
		//最后解除注册
		flower.unregisterInsect(b1);
		flower.unregisterInsect(b2);
		flower.unregisterInsect(b3);
	}

}
