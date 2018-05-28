package com.creational.factory_method.simplefactory;

/** 
 * @Title: FactoryTest
 * @Description: 简单工厂模式
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:14:12
 */
public class FactoryTest {
	
	//Music begin Playing!
	public static void main(String[] args) {
		PlayFactory pf = new PlayFactory();
		Player p = pf.produce("music");
		p.Play();
	}

}
