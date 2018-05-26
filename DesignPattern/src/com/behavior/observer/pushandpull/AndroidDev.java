package com.behavior.observer.pushandpull;

/** 
 * @Title: AndroidDev 
 * @Description: 具体观察者安卓开发者
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:05:11 
 *  
 */
public class AndroidDev implements User{

	@Override
	public void update(OfficalAccount account) {
		System.out.println("读者查看公众号更新信息："+((CoderPig)account).getMsg());
	}

}
