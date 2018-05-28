package com.creational.factory_method.staticfactory;

/** 
 * @Title: FactoryTest
 * @Description: 静态工厂模式
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:14:12
 */
public class FactoryTest {
	
	//Music begin Playing!
	public static void main(String[] args) {
		MusicPlayer p = (MusicPlayer) PlayFactory.produceMusic();
		p.Play();
	}

}
