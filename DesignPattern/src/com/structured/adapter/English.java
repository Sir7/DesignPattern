package com.structured.adapter;

/** 
 * @Title: English
 * @Description: 需要适配的类(Adaptee)：需要适配的类或适配者类；
 * @author yang.lvsen
 * @date 2018年5月25日 下午1:40:38
 */
public class English {
	
	/**
	 * 传入需要翻译的英语
	 * 
	 * @author yang.lvsen
	 * @date 2018年5月25日下午2:19:49
	 * @param str
	 * @return void
	 */
	public void speakEnglish(String str){
		System.out.println("【英语】:"+str);
	}

}
