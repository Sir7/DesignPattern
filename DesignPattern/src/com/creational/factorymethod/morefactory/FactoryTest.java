package com.creational.factorymethod.morefactory;

/** 
 * @Title: FactoryTest
 * @Description: �๤��ģʽ����
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:14:12
 */
public class FactoryTest {
	/**
	 * ��Ҫʵ����������!!!
	 */
	
	//��ӡ��Music begin Playing!
	public static void main(String[] args) {
		PlayFactory pf = new PlayFactory();
		Player p = pf.produceMusic();
		p.Play();
	}

}
