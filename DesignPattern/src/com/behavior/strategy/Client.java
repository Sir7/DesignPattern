package com.behavior.strategy;

/** 
 * @Title: Client 
 * @Description: 客户端测试
 * @author yang.lvsen
 * @date 2018年5月26日 下午1:58:27 
 *  
 */
public class Client {
	
	/*
	 * 策略行为抽取出来，统一的接口，然后各自实现，比如这里我们把抽取计算的接口，然后继承分别实现加减乘除：
	 */
	public static void main(String[] args) {
		Context c = new Context();
		
		c.setCompute(new Add());
		c.calc(1, 2);
		
		c.setCompute(new Sub());
		c.calc(3, 4);
		
		c.setCompute(new Mul());
		c.calc(5, 6);
		
		c.setCompute(new Div());
		c.calc(7, 8);
	}

}
