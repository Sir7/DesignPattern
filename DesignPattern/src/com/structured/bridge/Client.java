package com.structured.bridge;

/** 
 * @Title: Client
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午4:03:11
 */
public class Client {
	public static void main(String[] args) {
		Steak s1 = new BeefSteak(new Rice());
		System.out.println("卖出了："+s1.sale());//卖出一份牛扒饭
		
		Steak s2 = new PorkSteak(new Spaghetti());
		System.out.println("卖出了："+s2.sale());//卖出了猪扒意粉
		
		Steak s3 = new PorkSteak(null);
		System.out.println("卖出了："+s3.sale());//猪扒
		
		
		Sauces sa1 = new HeiJiaoSauces(new BeefSteak(new Spaghetti()));
		System.out.println("卖出一份："+sa1.sauces());//卖出一份意粉加黑椒汁
		
		Sauces sa2 = new XiangCaoSauces(new PorkSteak(null));
		System.out.println("卖出一份："+sa2.sauces());//卖出一份猪扒加香草汁
		
	}

}
