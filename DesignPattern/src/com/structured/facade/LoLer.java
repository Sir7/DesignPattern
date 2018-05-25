package com.structured.facade;

/** 
 * @Title: XLoLer
 * @Description: 召唤师
 * @author yang.lvsen
 * @date 2018年5月25日 下午5:17:14
 */
public class LoLer {
	
	public static void main(String[] args) {
		JiaoBen jiaoBen = new JiaoBen();
		//瑞雯的光速QA：Q + 空格 + A + 鼠标左键 + Q + 空格 + A + 鼠标左键 + Q + 空格 + A + 鼠标左键 
        System.out.println("=== 锐雯一键光速QA ===\n" + jiaoBen.RW());
	    //瞎子一秒七脚：Q + A + E + 九头蛇 + R + A + 闪现 + Q 
        System.out.println("=== 瞎子一键一秒七脚 ===\n" + jiaoBen.MS());
	}

}
