package com.creational.factorymethod.simplefactory;

/** 
 * @Title: FactoryTest
 * @Description: �򵥹���ģʽ����
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:14:12
 */
public class FactoryTest {
	/**
	 * ���������ַ������󣬲�����ȷ��������!���Ǽ򵥹���ģʽ���ı׶ˣ�����
	 */
	
	//��ӡ��Music begin Playing!
	public static void main(String[] args) {
		PlayFactory pf = new PlayFactory();
		Player p = pf.produce("music");
		p.Play();
	}

}
