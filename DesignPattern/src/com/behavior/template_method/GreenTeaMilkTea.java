package com.behavior.template_method;

/** 
 * @Title: GreenMilkTea 
 * @Description: 具体实现类
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:56:11 
 *  
 */
public class GreenTeaMilkTea extends Tea{
	
	private boolean isPack = true;

    public GreenTeaMilkTea(boolean isPack) {
        this.isPack = isPack;
    }

    @Override 
    protected void 加茶() {
        System.out.println("加入绿茶");
    }

    @Override 
    protected void 加料() {
        System.out.println("加入椰果");
    }

    @Override 
    protected boolean 是否打包() {
        return isPack;
    }

}
