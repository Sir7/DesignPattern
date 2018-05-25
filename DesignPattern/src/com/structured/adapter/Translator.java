package com.structured.adapter;

/** 
 * @Title: Translator
 * @Description: 适配器(Adapter)：通过包装一个需要适配的对象，把原接口转换成目标接口；
 * @author yang.lvsen
 * @date 2018年5月25日 下午1:41:52
 */
public class Translator implements Chinese{
	
	private English english = new English();
	
	public Translator(English english ) {
		this.english = english;
	}
	
	/**
	 * 传入需要翻译成中文的英语字母
	 */
	@Override
	public void speakChinese(String str) {
		english.speakEnglish(str);
	}

}
