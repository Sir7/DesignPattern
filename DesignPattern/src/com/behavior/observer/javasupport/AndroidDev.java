package com.behavior.observer.javasupport;

import java.util.Observable;
import java.util.Observer;

/** 
 * @Title: AndroidDev 
 * @Description: 具体观察者安卓开发者
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:05:11 
 * 口诀：被观察者   实现    继承Observable，观察者   实现    Observer接口 
 */
public class AndroidDev implements Observer{

	@Override
	public void update(Observable o, Object obj) {
		System.out.println("读者查看公众号更新信息："+obj);
	}

}
