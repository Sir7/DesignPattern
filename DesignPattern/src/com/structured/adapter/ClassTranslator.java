package com.structured.adapter;

/** 
 * @Title: ClassTranslator
 * @Description: 类适配模式写法
 * @author yang.lvsen
 * @date 2018年5月25日 下午1:49:17
 */
public class ClassTranslator extends English implements Chinese{

	@Override
	public void speakChinese(String str) {
		speakEnglish(str);
	}

}
