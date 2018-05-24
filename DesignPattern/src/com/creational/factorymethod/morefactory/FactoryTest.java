package com.creational.factorymethod.morefactory;

/** 
 * @Title: FactoryTest
 * @Description: 多工厂模式测试
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:14:12
 */
public class FactoryTest {
	/**
	 * 需要实例化工厂类!!!
	 */
	
	//打印：Music begin Playing!
	public static void main(String[] args) {
		PlayFactory pf = new PlayFactory();
		Player p = pf.produceMusic();
		p.Play();
	}

}
