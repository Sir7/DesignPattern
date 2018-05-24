package com.creational.factorymethod.simplefactory;

/** 
 * @Title: PlayFactory
 * @Description: 创建工厂
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:12:08
 */
public class PlayFactory {
	
	public Player produce(String type) {
		if("music".equals(type)){
			return new MusicPlayer();
		}else if("video".equals(type)){
			return new VideoPlayer();
		}else{
			System.out.println("The type is not find!");
			return null;
		}
	}

}
