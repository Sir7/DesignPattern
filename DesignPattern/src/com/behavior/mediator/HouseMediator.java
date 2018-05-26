package com.behavior.mediator;

/** 
 * @Title: HouseMediator 
 * @Description: 具体中介类
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:08:15 
 *  
 */
public class HouseMediator extends Mediator{
	/*
	 * 具体中介类，因为中介者知道所有的同事，这里创建两个引用，另外实现交互方法时对，调用者进行判断，完成对应的信息显示，比如这里房东发的，房客收到。
	 */
	
	//中介者知道所有的同事
	private Landlord landlord;
	private Tenant tenant;
	
	
	public Landlord getLandlord(){
		return landlord;
	}
	
	public void setLandlord(Landlord landlord){
		this.landlord = landlord;
	}
	
	public Tenant getTenant(){
		return tenant;
	}
	
	public void setTenant(Tenant tenant){
		this.tenant = tenant;
	}

	@Override
	public void contact(People people, String msg) {
		if(people == tenant){
			tenant.getMessage(msg);
		}else{
			landlord.getMessage(msg);
		}
	}

}
