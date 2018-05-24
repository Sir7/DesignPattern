package com.creational.factorymethod.simplefactory;

/** 
 * @Title: PlayFactory
 * @Description: ��������
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:12:08
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
