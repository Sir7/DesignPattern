package com.creational.abstractfactory;

/** 
 * @Title: MusicPlayerFactory
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:33:50
 */
public class MusicPlayerFactory implements Provider{

	@Override
	public Player produce() {
		// TODO Auto-generated method stub
		return new MusicPlayer();
	}
	

}
