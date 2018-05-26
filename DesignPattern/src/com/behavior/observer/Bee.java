package com.behavior.observer;

/** 
 * @Title: Bee 
 * @Description: 具体观察类——蜜蜂类
 * @author yang.lvsen
 * @date 2018年5月26日 下午2:23:17 
 *  
 */
public class Bee implements Insect{
	
	private int bId;	//蜜蜂编号
	
	public Bee(int bId){
		this.bId = bId;
	}
	
	//观察者对被观察者的状态做出的反应动作，采蜜
	@Override
	public void work() {
		System.out.println("蜜蜂"+bId+"采蜜");
	}

	//观察者对被观察者的状态做出的反应动作，回巢
	@Override
	public void unWork() {
		System.out.println("蜜蜂"+bId+"回巢");
	}

}
