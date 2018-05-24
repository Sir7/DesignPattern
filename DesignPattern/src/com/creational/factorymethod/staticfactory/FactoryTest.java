package com.creational.factorymethod.staticfactory;

/** 
 * @Title: FactoryTest
 * @Description: 静态工厂模式测试
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:14:12
 */
public class FactoryTest {
	/**
	 * 简单工厂模式如果传入的字符串有误，不能正确创建对象，静态工厂模式相对于多工厂模式，不需要实例化工厂类。所以工厂模式选择
	 */
	
	//打印：Music begin Playing!
	public static void main(String[] args) {
		MusicPlayer p = (MusicPlayer) PlayFactory.produceMusic();
		p.Play();
	}

}
