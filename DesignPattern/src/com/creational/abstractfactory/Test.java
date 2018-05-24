package com.creational.abstractfactory;

/** 
 * @Title: Test
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月24日 下午3:35:27
 */
public class Test {
	
	public static void main(String[] args) {
		Provider p = new MusicPlayerFactory();
		MusicPlayer mp = (MusicPlayer) p.produce();
		//输出结果：Music begin playing
		mp.Play();
	}

}
