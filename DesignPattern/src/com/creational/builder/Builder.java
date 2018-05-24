package com.creational.builder;

/** 
 * @Title: Builder 
 * @Description: 抽象的Builder类，规范产品的组建，一般由子类实现具体过程
 * @author yang.lvsen
 * @date 2018年5月24日 下午8:31:01 
 *  
 */
public interface Builder {
	public void buildHost();
    public void buildDisplay();
    public Computer retrieveResult();
}
