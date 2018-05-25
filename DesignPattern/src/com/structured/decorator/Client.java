package com.structured.decorator;

/** 
 * @Title: Client
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:34:16
 */
public class Client {

	public static void main(String[] args) {
		Tea t1 = new MilkTea();
		System.err.println("您点的是："+t1.getName()+"，价格是："+t1.price());
		
		Tea t2 = new LemonTea();
		t2 = new JinJu(t2);
		System.out.println("您点的是："+t2.getName()+"，价格是："+t2.price());
		
		
		Tea t3 = new LemonTea();
		t3 = new ZhenZhu(t3);
		t3 = new YeGuo(t3);
		t3 = new HongDou(t3);
		t3 = new JinJu(t3);
		System.out.println("您点的是："+t3.getName()+"，价格是："+t3.price());
		
	}
}
