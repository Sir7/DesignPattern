package com.creational.abstractfactory;

/** 
 * @Title: MusicPlayerFactory
 * @Description: 
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:33:50
 */
public class MusicPlayerFactory implements Provider{

	@Override
	public Player produce() {
		// TODO Auto-generated method stub
		return new MusicPlayer();
	}
	

}
