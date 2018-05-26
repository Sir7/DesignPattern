package com.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Title: Flower 
 * @Description: 具体被观察者 —— 花朵类，定义一个集合存储观察者，实现相关方法
 * @author yang.lvsen
 * @date 2018年5月26日 下午2:27:35 
 *  
 */
public class Flower implements Plant{
	
	private List<Insect> insects = new ArrayList<>();
	
	

	@Override
	public void registerInsect(Insect insect) {
		insects.add(insect);
	}

	@Override
	public void unregisterInsect(Insect insect) {
		insects.remove(insect);
	}

	@Override
	public void notifyInsect(boolean isOpen) {
		if(isOpen){
			System.out.println("花开");
			for(Insect insect:insects){
				insect.work();
			}
		}else{
			System.out.println("花闭");
			for(Insect insect:insects){
				insect.unWork();
			}
		}
	}

}
