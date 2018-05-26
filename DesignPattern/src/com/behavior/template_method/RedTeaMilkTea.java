package com.behavior.template_method;

/** 
 * @Title: RealMilkTea 
 * @Description: 具体实现类
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:55:36 
 *  
 */
public class RedTeaMilkTea extends Tea{
	
	@Override 
	protected void 加茶() {
        System.out.println("加入红茶");
    }

    @Override 
    protected void 加料() {
        System.out.println("加入珍珠");
    }

}
