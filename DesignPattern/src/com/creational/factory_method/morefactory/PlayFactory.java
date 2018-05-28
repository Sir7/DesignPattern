package com.creational.factory_method.morefactory;

/** 
 * @Title: PlayFactory
 * @Description: 多工厂模式
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:12:08
 */
public class PlayFactory {
	
	public Player produceMusic(){
		return new MusicPlayer();
	}

	public Player produceVideo(){
		return new VideoPlayer();
	}
}
