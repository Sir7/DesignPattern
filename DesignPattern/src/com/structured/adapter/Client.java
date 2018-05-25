package com.structured.adapter;

/** 
 * @Title: Client
 * @Description: 客户端测试
 * @author yang.lvsen
 * @date 2018年5月25日 下午1:44:19
 */
public class Client {
	
	public static void main(String[] args) {
		/**
		 * 对象适配器测试
		 */
		Chinese c = new Translator(new English());
		c.speakChinese("你很棒！");
		
		
		
		
		/**
		 * 类适配器测试
		 */
		ClassTranslator ct = new ClassTranslator();
		ct.speakChinese("你也很好啊！");
	}

}
