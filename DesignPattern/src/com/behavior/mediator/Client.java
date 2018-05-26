package com.behavior.mediator;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:12:09 
 *  
 */
public class Client {

	public static void main(String[] args) {
		//实例化中介者
		HouseMediator hm = new HouseMediator();
			
		//实例化同事对象，传入中介者实例
		Landlord landlord= new Landlord("包租婆",hm);	
		Tenant tenant= new Tenant("小猪",hm);	
			
		//为中介者传入同事实例
		hm.setLandlord(landlord);
		hm.setTenant(tenant);
		
		//调用
		landlord.contact("单间500一个月，有兴趣吗？");
		tenant.contact("热水器，空调，网络都有吗？");
		landlord.contact("都有");
		tenant.contact("好的，我租了");
		
		/*
		 * 输出：
		 * 	【房东】：包租婆:单间500一个月，有兴趣吗？
			【房客】：小猪:热水器，空调，网络都有吗？
			【房东】：包租婆:都有
			【房客】：小猪:好的，我租了	
		 */
	}
}
