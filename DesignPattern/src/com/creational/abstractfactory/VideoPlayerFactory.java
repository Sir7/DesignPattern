package com.creational.abstractfactory;

/** 
 * @Title: VideoPlayerFactory
 * @Description: 
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:34:34
 */
public class VideoPlayerFactory implements Provider{

	@Override
	public Player produce() {
		// TODO Auto-generated method stub
		return new VideoPlayer();
	}

}
