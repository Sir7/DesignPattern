package com.creational.factorymethod.morefactory;

/** 
 * @Title: PlayFactory
 * @Description: ��������
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:12:08
 */
public class PlayFactory {
	
	public Player produceMusic(){
		return new MusicPlayer();
	}

	public Player produceVideo(){
		return new VideoPlayer();
	}
}
