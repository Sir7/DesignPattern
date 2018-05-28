package com.creational.factory_method.staticfactory;

import com.creational.factory_method.morefactory.MusicPlayer;
import com.creational.factory_method.morefactory.Player;
import com.creational.factory_method.morefactory.VideoPlayer;

/** 
 * @Title: PlayFactory
 * @Description: 静态工厂模式
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:12:08
 */
public class PlayFactory {
	
	public static Player produceMusic(){
		return new MusicPlayer();
	}

	public static Player produceVideo(){
		return new VideoPlayer();
	}

}
