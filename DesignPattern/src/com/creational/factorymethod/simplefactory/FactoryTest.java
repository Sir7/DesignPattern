package com.creational.factorymethod.simplefactory;

/** 
 * @Title: FactoryTest
 * @Description: 简单工厂模式测试
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:14:12
 */
public class FactoryTest {
	/**
	 * 如果传入的字符串有误，不能正确创建对象!这是简单工厂模式最大的弊端！！！
	 */
	
	//打印：Music begin Playing!
	public static void main(String[] args) {
		PlayFactory pf = new PlayFactory();
		Player p = pf.produce("music");
		p.Play();
	}

}
