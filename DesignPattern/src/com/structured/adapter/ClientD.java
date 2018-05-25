package com.structured.adapter;

/** 
 * @Title: ClientD
 * @Description: 缺省适配器模式
 * @author yang.lvsen
 * @date 2018年5月25日 下午1:57:17
 */
public class ClientD {
	/*
	 * 缺省适配器模式
	 * 当不需要实现一个接口所提供的所有方法时，可先设计一个抽象类实现该接口，并为接口中每个方法提供一个默认实现（空方法）， 
	 * 那么该抽象类的子类可以选择性地覆盖父类的某些方法来实现需求， 它适用于不想使用一个接口中的所有方法的情况，又称为单接口适配器模式。
	 * 
	 * 简单点说就是：不想实现接口里的所有方法，写个基类去继承这个接口，然后重写所有方法，子类再去继承这个基类，按需重写！
	 */
	
	public static void main(String[] args) {
		BaseAdapter ba = new ChineseAdapter(new English());
		ba.speakCantonese("母鸡啊");
	}

}



interface ChineseTarget {
	void speakChinese(String str);	//普通话
	void speakCantonese(String str);	//广东话
	void speakShanghaiese(String str);	//上海话
}

//父类适配器
class BaseAdapter implements ChineseTarget{

	@Override
	public void speakChinese(String str) {
		System.out.println("中译英");
	}

	@Override
	public void speakCantonese(String str) {
		System.out.println("粤译英");
	}

	@Override
	public void speakShanghaiese(String str) {
		System.out.println("沪译英");
	}
	
}

//普通话转换的适配器
class ChineseAdapter extends BaseAdapter{
	private English english;
	
	ChineseAdapter(English english) {
		this.english = english;
	}
	
	@Override
	public void speakChinese(String str) {
		english.speakEnglish(str);
	}
	
}
