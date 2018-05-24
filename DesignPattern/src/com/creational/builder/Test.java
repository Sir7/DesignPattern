package com.creational.builder;

/** 
 * @Title: Test 
 * @Description: 客户
 * @author yang.lvsen
 * @date 2018年5月24日 下午8:35:53 
 *  
 */
public class Test {
	
	public static void main(String[] args) {
		//客户说要一台联想电脑
		Builder builder = new LenovoBuilder();
		//组装人员接到任务，需要组装一台联想电脑
		Director d = new Director(builder);
		//开始组装电脑
		d.construct();
		//组装好了一台电脑
		Computer c = builder.retrieveResult();
		//输出：联想主机
		System.out.println(c.getHost());
		//输出：联想显示器
		System.out.println(c.getDisplay());
	}

}
