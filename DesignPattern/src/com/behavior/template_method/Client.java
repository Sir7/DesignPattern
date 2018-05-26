package com.behavior.template_method;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:56:52 
 *  
 */
public class Client {
	
	public static void main(String[] args) {
        Tea tea1 = new RedTeaMilkTea();
        Tea tea2 = new GreenTeaMilkTea(false);

        tea1.make();
        System.out.println("");
        tea2.make();
    }

}
