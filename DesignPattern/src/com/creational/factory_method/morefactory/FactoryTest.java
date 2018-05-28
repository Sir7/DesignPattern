package com.creational.factory_method.morefactory;

/** 
 * @Title: FactoryTest
 * @Description: 多工厂模式
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:14:12
 */
public class FactoryTest {
	
	//输出Music begin Playing!
	public static void main(String[] args) {
		PlayFactory pf = new PlayFactory();
		Player p = pf.produceMusic();
		p.Play();
	}

}
