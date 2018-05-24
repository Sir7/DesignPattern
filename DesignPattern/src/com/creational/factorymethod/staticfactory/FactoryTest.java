package com.creational.factorymethod.staticfactory;

/** 
 * @Title: FactoryTest
 * @Description: ��̬����ģʽ����
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:14:12
 */
public class FactoryTest {
	/**
	 * �򵥹���ģʽ���������ַ������󣬲�����ȷ�������󣬾�̬����ģʽ����ڶ๤��ģʽ������Ҫʵ���������ࡣ���Թ���ģʽѡ��
	 */
	
	//��ӡ��Music begin Playing!
	public static void main(String[] args) {
		MusicPlayer p = (MusicPlayer) PlayFactory.produceMusic();
		p.Play();
	}

}
