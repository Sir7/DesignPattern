package com.creational.factorymethod.staticfactory;

/** 
 * @Title: VideoPlayer
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:11:29
 */
public class VideoPlayer implements Player{

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("Video begin Playing!"); 
	}

}
