package com.creational.abstractfactory;

/** 
 * @Title: Test
 * @Description: 
 * @author yang.lvsen
 * @date 2018��5��24�� ����3:35:27
 */
public class Test {
	
	public static void main(String[] args) {
		Provider p = new MusicPlayerFactory();
		MusicPlayer mp = (MusicPlayer) p.produce();
		//��������Music begin playing
		mp.Play();
	}

}
