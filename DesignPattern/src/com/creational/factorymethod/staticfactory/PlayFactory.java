package com.creational.factorymethod.staticfactory;

import com.creational.factorymethod.morefactory.MusicPlayer;
import com.creational.factorymethod.morefactory.Player;
import com.creational.factorymethod.morefactory.VideoPlayer;

/** 
 * @Title: PlayFactory
 * @Description: ��������
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:12:08
 */
public class PlayFactory {
	
	public static Player produceMusic(){
		return new MusicPlayer();
	}

	public static Player produceVideo(){
		return new VideoPlayer();
	}

}
